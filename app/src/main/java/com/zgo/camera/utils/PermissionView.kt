package com.zgo.camera.utils


import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState


/*
 * 权限请求
 * 
 * @author: zhhli
 * @date: 22/7/26
 */

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun PermissionView(
    permission: String = android.Manifest.permission.CAMERA,
    rationale: String = "该功能需要此权限，请打开该权限。",
    permissionNotAvailableContent: @Composable () -> Unit = { },
    content: @Composable () -> Unit = { }
) {
    val permissionState = rememberPermissionState(permission)
//    PermissionRequired(
//        permissionState = permissionState,
//        permissionNotGrantedContent = {
//            Rationale(
//                text = rationale,
//                onRequestPermission = { permissionState.launchPermissionRequest() }
//            )
//        },
//        permissionNotAvailableContent = permissionNotAvailableContent,
//        content = content
//    )

    if(permissionState.status.isGranted){
        content()
    }else {
        Rationale(
            text = rationale,
            onRequestPermission = { permissionState.launchPermissionRequest() }
        )
    }


}

@Composable
private fun Rationale(
    text: String,
    onRequestPermission: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { /* Don't */ },
        title = {
            Text(text = "请求权限")
        },
        text = {
            Text(text)
        },
        confirmButton = {
            TextButton(onClick = onRequestPermission) {
                Text("确定")
            }
        }
    )
}

fun openSettingsPermission(context: Context) {
    context.startActivity(
        Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
            data = Uri.fromParts("package", context.packageName, null)
        }
    )
}
