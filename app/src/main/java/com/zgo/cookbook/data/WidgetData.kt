package com.zgo.cookbook.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.zgo.cookbook.ui.md3.alert_dialog.AlertDialogExample
import com.zgo.cookbook.ui.md3.button.ButtonsExample
import com.zgo.demo.data.ZgoPage


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */

open class IWidget(
    override val title: String,
    open val image: ImageVector = Icons.Filled.CrueltyFree,
    override val content: @Composable () -> Unit
) : ZgoPage(title, content)

class CookWidget(
    override val title: String,
    override val image: ImageVector = Icons.Filled.CrueltyFree,
    override val content: @Composable () -> Unit
) : IWidget(title, image, content)


val Md3Widgets = listOf(
    CookWidget("AlertDialog", Icons.Filled.Forum) { AlertDialogExample() },
    CookWidget("Button", Icons.Filled.TouchApp) { ButtonsExample() },
    CookWidget("Text", Icons.Filled.Article) { ButtonsExample() },
    CookWidget("TextField") { ButtonsExample() },
    CookWidget("Icon") { ButtonsExample() },
    CookWidget("Image") { ButtonsExample() },
    CookWidget("Chip") { ButtonsExample() },
    CookWidget("ProgressBar", Icons.Filled.Refresh) { ButtonsExample() },
    CookWidget("Switch", Icons.Filled.ToggleOn) { ButtonsExample() },
    CookWidget("Surface") { ButtonsExample() },

    )





