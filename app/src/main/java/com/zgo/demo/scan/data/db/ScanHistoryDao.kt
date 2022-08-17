package com.zgo.demo.scan.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zgo.lib.data.db.BaseDao
import kotlinx.coroutines.flow.Flow


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/14
 */

@Dao
interface ScanHistoryDao : BaseDao<ScanHistory> {
    @Query("SELECT * from ScanHistory ORDER BY id DESC")
    fun getAll(): Flow<List<ScanHistory>>

    @Query("SELECT * from ScanHistory WHERE id = :id")
    fun getItem(id: Int): Flow<ScanHistory>

    // Specify the conflict strategy as IGNORE, when the user tries to add an
    // existing Item into the database Room ignores the conflict.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    override suspend fun insert(obj: ScanHistory)


}