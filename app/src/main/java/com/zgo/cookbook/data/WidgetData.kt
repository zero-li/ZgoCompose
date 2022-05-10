package com.zgo.cookbook.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.zgo.cookbook.ui.md3.alert_dialog.AlertDialogExample
import com.zgo.cookbook.ui.md3.button.ButtonsExample
import com.zgo.cookbook.ui.md3.chip.ChipExample
import com.zgo.cookbook.ui.md3.icon.IconExample
import com.zgo.cookbook.ui.md3.image.ImageExample
import com.zgo.cookbook.ui.md3.progress.ProgressBarExample
import com.zgo.cookbook.ui.md3.surface.SurfaceExample
import com.zgo.cookbook.ui.md3.switch.SwitchExample
import com.zgo.cookbook.ui.md3.text.TextExample
import com.zgo.cookbook.ui.md3.text_field.TextFieldExample
import com.zgo.cookbook.ui.third.RadarExample
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
    CookWidget("Text", Icons.Filled.Article) { TextExample() },
    CookWidget("TextField") { TextFieldExample() },
    CookWidget("Icon") { IconExample() },
    CookWidget("Image") { ImageExample() },
    CookWidget("Chip") { ChipExample() },
    CookWidget("ProgressBar", Icons.Filled.Refresh) { ProgressBarExample() },
    CookWidget("Switch", Icons.Filled.ToggleOn) { SwitchExample() },
    CookWidget("Surface") { SurfaceExample() },

    )


val ThirdWidgets = listOf(
    CookWidget("Radar", Icons.Filled.Radar) { RadarExample() },
)


