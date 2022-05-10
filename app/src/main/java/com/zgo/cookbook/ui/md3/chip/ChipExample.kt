package com.zgo.cookbook.ui.md3.chip

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


//import androidx.compose.foundation.horizontalScroll
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Close
//import androidx.compose.material.icons.filled.Done
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.AssistChip
//import androidx.compose.material3.AssistChipDefaults
//import androidx.compose.material3.ElevatedAssistChip
//import androidx.compose.material3.ElevatedFilterChip
//import androidx.compose.material3.ElevatedSuggestionChip
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.FilterChip
//import androidx.compose.material3.FilterChipDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.InputChip
//import androidx.compose.material3.InputChipDefaults
//import androidx.compose.material3.SuggestionChip
//import androidx.compose.material3.Text
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.unit.dp

/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/10
 */
@Composable
fun ChipExample() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}
/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssistChipSample() {

    Chip()
    AssistChip(
        onClick = { *//* Do something! *//* },
        label = { Text("Assist Chip") },
        leadingIcon = {
            Icon(
                Icons.Filled.Settings,
                contentDescription = "Localized description",
                Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ElevatedAssistChipSample() {
    ElevatedAssistChip(
        onClick = { *//* Do something! *//* },
        label = { Text("Assist Chip") },
        leadingIcon = {
            Icon(
                Icons.Filled.Settings,
                contentDescription = "Localized description",
                Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun FilterChipSample() {
    var selected by remember { mutableStateOf(false) }
    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter chip") },
        selectedIcon = {
            Icon(
                imageVector = Icons.Filled.Done,
                contentDescription = "Localized Description",
                modifier = Modifier.size(FilterChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ElevatedFilterChipSample() {
    var selected by remember { mutableStateOf(false) }
    ElevatedFilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter chip") },
        selectedIcon = {
            Icon(
                imageVector = Icons.Filled.Done,
                contentDescription = "Localized Description",
                modifier = Modifier.size(FilterChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun FilterChipWithLeadingIconSample() {
    var selected by remember { mutableStateOf(false) }
    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter chip") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Home,
                contentDescription = "Localized description",
                modifier = Modifier.size(FilterChipDefaults.IconSize)
            )
        },
        selectedIcon = {
            Icon(
                imageVector = Icons.Filled.Done,
                contentDescription = "Localized Description",
                modifier = Modifier.size(FilterChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun InputChipSample() {
    InputChip(
        onClick = { *//* Do something! *//* },
        label = { Text("Input Chip") },
        trailingIcon = {
            Icon(
                Icons.Filled.Close,
                contentDescription = "Localized description",
                Modifier.size(InputChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun InputChipWithAvatarSample() {
    InputChip(
        onClick = { *//* Do something! *//* },
        label = { Text("Input Chip") },
        avatar = {
            Icon(
                Icons.Filled.Person,
                contentDescription = "Localized description",
                Modifier.size(InputChipDefaults.AvatarSize)
            )
        },
        trailingIcon = {
            Icon(
                Icons.Filled.Close,
                contentDescription = "Localized description",
                Modifier.size(InputChipDefaults.IconSize)
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SuggestionChipSample() {
    SuggestionChip(
        onClick = { *//* Do something! *//* },
        label = { Text("Suggestion Chip") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ElevatedSuggestionChipSample() {
    ElevatedSuggestionChip(
        onClick = { *//* Do something! *//* },
        label = { Text("Suggestion Chip") }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipGroupSingleLineSample() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            repeat(9) { index ->
                InputChip(
                    modifier = Modifier.padding(horizontal = 8.dp),
                    onClick = { *//* do something*//* },
                    label = { Text("Chip $index") }
                )
            }
        }
    }
}*/
