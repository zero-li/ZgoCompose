package com.zgo.demo.scan.ui.history

import com.zgo.demo.scan.data.db.ScanHistory
import com.zgo.demo.scan.database
import com.zgo.lib.ui.base.BaseViewModel


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/15
 */


class HistoryViewModel : BaseViewModel() {

    val list = mutableListOf<ScanHistory>()

// fun getAll(){
//  viewModelScope.launch {
//   withContext(Dispatchers.IO){
//    list = database.historyDao().getAll().
//   }
//  }
//
// }


    fun getAll() = database.historyDao().getAll()

}