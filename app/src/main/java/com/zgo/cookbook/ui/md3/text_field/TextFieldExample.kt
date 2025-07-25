@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.md3.text_field

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.material3.*
import androidx.compose.material3.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/10
 */
@Composable
fun TextFieldExample() {
    LazyColumn(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { SimpleTextFieldSample() }
        item { SimpleOutlinedTextFieldSample() }
        item { TextFieldWithIcons() }
        item { TextFieldWithPlaceholder() }
        item { TextFieldWithErrorState() }
        item { TextFieldWithSupportingText() }
        item { PasswordTextField() }
        item { TextFieldSample() }
        item { OutlinedTextFieldSample() }
        item { TextFieldWithHideKeyboardOnImeAction() }
        item { TextArea() }
        item { CustomTextFieldBasedOnDecorationBox() }
        item { CustomOutlinedTextFieldBasedOnDecorationBox() }
    }

}


@Composable
fun SimpleTextFieldSample() {
    var text by rememberSaveable { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "TextField") },
        singleLine = true
    )
}


@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("OutlinedTextField") }
    )
}


@Composable
fun TextFieldWithIcons() {
    var text by rememberSaveable { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text("TextFieldWithIcons") },
        leadingIcon = { Icon(Icons.Filled.Favorite, contentDescription = "Localized description") },
        trailingIcon = { Icon(Icons.Filled.Info, contentDescription = "Localized description") }
    )
}


@Composable
fun TextFieldWithPlaceholder() {
    var text by rememberSaveable { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("WithPlaceholder Email") },
        placeholder = { Text("example@gmail.com") }
    )
}

@Composable
fun TextFieldWithErrorState() {
    val errorMessage = "Email format is invalid"
    var text by rememberSaveable { mutableStateOf("") }
    var isError by rememberSaveable { mutableStateOf(false) }

    fun validate(text: String) {
        isError = !text.contains('@')
    }

    Column {
        TextField(
            value = text,
            onValueChange = {
                text = it
                isError = false
            },
            singleLine = true,
            label = { Text(if (isError) "Email*" else "Email") },
            isError = isError,
            keyboardActions = KeyboardActions { validate(text) },
            modifier = Modifier.semantics {
                // Provide localized description of the error
                if (isError) error(errorMessage)
            }
        )
        // Supporting text for error message.
        Text(
            text = errorMessage,
            color = MaterialTheme.colorScheme.error,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .padding(start = 16.dp, top = 4.dp)
                .alpha(if (isError) 1f else 0f)
        )
    }
}

@Composable
fun TextFieldWithSupportingText() {
    var text by rememberSaveable { mutableStateOf("") }

    Column {
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") }
        )
        Text(
            text = "Supporting text",
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(start = 16.dp, top = 4.dp)
        )
    }
}

@Composable
fun PasswordTextField() {
    var password by rememberSaveable { mutableStateOf("") }
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    TextField(
        value = password,
        onValueChange = { password = it },
        singleLine = true,
        label = { Text("Enter password") },
        visualTransformation =
        if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            IconButton(onClick = { passwordHidden = !passwordHidden }) {
                val visibilityIcon =
                    if (passwordHidden) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                // Please provide localized description for accessibility services
                val description = if (passwordHidden) "Show password" else "Hide password"
                Icon(imageVector = visibilityIcon, contentDescription = description)
            }
        }
    )
}

/** We copy the implementation of Visibility and VisibilityOff icons to showcase them in the
 * password text field sample but to avoid adding material-icons-extended library as a dependency
 * to the samples not to increase the build time
 */
private val Icons.Filled.Visibility: ImageVector
    get() {
        if (_visibility != null) {
            return _visibility!!
        }
        _visibility = materialIcon(name = "Filled.Visibility") {
            materialPath {
                moveTo(12.0f, 4.5f)
                curveTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f)
                curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f)
                reflectiveCurveToRelative(9.27f, -3.11f, 11.0f, -7.5f)
                curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        return _visibility!!
    }
private var _visibility: ImageVector? = null

private val Icons.Filled.VisibilityOff: ImageVector
    get() {
        if (_visibilityOff != null) {
            return _visibilityOff!!
        }
        _visibilityOff = materialIcon(name = "Filled.VisibilityOff") {
            materialPath {
                moveTo(12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f)
                lineToRelative(2.92f, 2.92f)
                curveToRelative(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f)
                curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f)
                curveToRelative(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f)
                lineToRelative(2.16f, 2.16f)
                curveTo(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(2.0f, 4.27f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(0.46f, 0.46f)
                curveTo(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f)
                curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f)
                curveToRelative(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f)
                lineToRelative(0.42f, 0.42f)
                lineTo(19.73f, 22.0f)
                lineTo(21.0f, 20.73f)
                lineTo(3.27f, 3.0f)
                lineTo(2.0f, 4.27f)
                close()
                moveTo(7.53f, 9.8f)
                lineToRelative(1.55f, 1.55f)
                curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f)
                lineToRelative(1.55f, 1.55f)
                curveToRelative(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f)
                close()
                moveTo(11.84f, 9.02f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(0.02f, -0.16f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                lineToRelative(-0.17f, 0.01f)
                close()
            }
        }
        return _visibilityOff!!
    }
private var _visibilityOff: ImageVector? = null

@Composable
fun TextFieldSample() {
    var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("example", TextRange(0, 7)))
    }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}

@Composable
fun OutlinedTextFieldSample() {
    var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("example", TextRange(0, 7)))
    }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextFieldWithHideKeyboardOnImeAction() {
    val keyboardController = LocalSoftwareKeyboardController.current
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(
            onDone = {
                keyboardController?.hide()
                // do something here
            }
        )
    )
}

@Composable
fun TextArea() {
    var text by rememberSaveable {
        mutableStateOf(
            "This is a very long input that extends beyond " +
                    "the height of the text area."
        )
    }
    TextField(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier.height(100.dp),
        label = { Text("Label") }
    )
}

@Composable
fun CustomTextFieldBasedOnDecorationBox() {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun CustomTextFieldBasedOnDecorationBox() {
        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun CustomTextField(
            value: String,
            onValueChange: (String) -> Unit,
            modifier: Modifier = Modifier
        ) {
            val interactionSource = remember { MutableInteractionSource() }
            // parameters below will be passed to BasicTextField for correct behavior of the text field,
            // and to the decoration box for proper styling and sizing
            val enabled = true
            val singleLine = true
            val passwordTransformation = PasswordVisualTransformation()

            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = modifier,
                visualTransformation = passwordTransformation,
                // internal implementation of the BasicTextField will dispatch focus events
                interactionSource = interactionSource,
                enabled = enabled,
                singleLine = singleLine
            ) {
                TextFieldDefaults.DecorationBox(
                    value = value,
                    visualTransformation = passwordTransformation,
                    innerTextField = it,
                    singleLine = singleLine,
                    enabled = enabled,
                    // same interaction source as the one passed to BasicTextField to read focus state
                    // for text field styling
                    interactionSource = interactionSource,
                    supportingText = { Text("Supporting text") },
                    // keep horizontal paddings but change the vertical
                    contentPadding =
                    TextFieldDefaults.contentPaddingWithoutLabel(top = 8.dp, bottom = 8.dp),
                )
            }
        }
    }
}

@Composable
fun CustomOutlinedTextFieldBasedOnDecorationBox() {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun CustomTextField(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier
    ) {
        val interactionSource = remember { MutableInteractionSource() }
        // parameters below will be passed to BasicTextField for correct behavior of the text field,
        // and to the decoration box for proper styling and sizing
        val enabled = true
        val singleLine = true

        val colors = TextFieldDefaults.colors(
//            unfocusedBorderColor = Color.LightGray,
//            focusedBorderColor = Color.DarkGray
        )
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            // internal implementation of the BasicTextField will dispatch focus events
            interactionSource = interactionSource,
            enabled = enabled,
            singleLine = singleLine
        ) {
            TextFieldDefaults.DecorationBox(
                value = value,
                visualTransformation = VisualTransformation.None,
                innerTextField = it,
                singleLine = singleLine,
                enabled = enabled,
                // same interaction source as the one passed to BasicTextField to read focus state
                // for text field styling
                interactionSource = interactionSource,
                supportingText = { Text("Supporting text") },
                // keep horizontal paddings but change the vertical
                contentPadding = TextFieldDefaults.textFieldWithoutLabelPadding(
                    top = 8.dp, bottom = 8.dp
                ),
                // update border colors
                colors = colors,
                // update border thickness and shape

            )
        }
    }
}

