package com.zgo.demo.scan

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.zgo.demo.scan.data.db.ScanRoomDatabase
import com.zgo.lib.ui.theme.AppTheme


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */

lateinit var database: ScanRoomDatabase

@Composable
fun ScanApp() {

    val context = LocalContext.current
    // Using by lazy so the database is only created when needed
    // rather than when the application starts
    val database2: ScanRoomDatabase by lazy { ScanRoomDatabase.getDatabase(context) }

    database = database2

    AppTheme {
        ScanNavGraph()

    }


}
