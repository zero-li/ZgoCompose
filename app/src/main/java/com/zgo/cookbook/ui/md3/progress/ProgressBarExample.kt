package com.zgo.cookbook.ui.md3.progress

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/10
 */
@Composable
fun ProgressBarExample() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { LinearProgressIndicator() }
        item {
            Spacer(Modifier.height(30.dp))
        }
        item { CircularProgressIndicator() }
        item {
            Spacer(Modifier.height(30.dp))
        }
        item { LinearProgressIndicatorSample() }
        item { CircularProgressIndicatorSample() }

    }

}


@Composable
fun LinearProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        LinearProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.requiredHeight(30.dp))
        OutlinedButton(
            onClick = {
                if (progress < 1f) progress += 0.1f
            }
        ) {
            Text("Increase")
        }
    }
}

@Composable
fun CircularProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        CircularProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.requiredHeight(30.dp))
        OutlinedButton(
            onClick = {
                if (progress < 1f) progress += 0.1f
            }
        ) {
            Text("Increase")
        }
    }
}