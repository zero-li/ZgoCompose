@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)

package com.zgo.demo.scan.ui.scanner

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zgo.demo.scan.data.db.ScanHistory
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/12
 */

@Composable
fun ScanResultPage(
    history: ScanHistory,
    onBack: () -> Unit,
) {
    ZgoScaffold(title = "扫描结果", onBackClick = onBack) {
        val clipboardManager: ClipboardManager = LocalClipboardManager.current

        val context = LocalContext.current


        Card(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 70.dp)
                .fillMaxWidth(),


            ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Text(
                    text = history.id.toString(),
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .align(alignment = Alignment.CenterHorizontally)

                )


                Text(
                    text = history.format,
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = history.code,
                    modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 10.dp)
                )

                OutlinedButton(
                    onClick = {
                        clipboardManager.setText(AnnotatedString(history.code))

                        Toast.makeText(context, "已复制到剪贴板", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                    modifier = Modifier
                        .padding(horizontal = 40.dp, vertical = 10.dp)
                        .fillMaxWidth()


                ) {
                    Text(text = "复制")

                }



                Row(
                    Modifier
                        .padding(horizontal = 50.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.width(100.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.TravelExplore,
                                contentDescription = "Search"
                            )
                        }

                        Text(text = "搜索")
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.width(100.dp)
                        ) {
                            Icon(imageVector = Icons.Filled.Share, contentDescription = "Share")
                        }
                        Text(text = "分享")
                    }

                }
            }


        }


        Box(modifier = Modifier.fillMaxWidth()) {
            Icon(
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .padding(top = (40).dp)
                    .size(60.dp)
                    .align(Alignment.Center)
                    .background(color = Color.White, shape = CircleShape)
                    .padding(15.dp),
                imageVector = Icons.Filled.QrCodeScanner, contentDescription = null
            )
        }

    }

}


@Preview
@Composable
fun Preview() {
    ScanResultPage(
        ScanHistory(
            code = "https://www.w3schools.com/SQl/sql_ref_asc.asp",
            format = "qrcode",
            type = "tel"
        )
    ) {

    }
}
