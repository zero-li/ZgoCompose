package com.zgo.demo.scan.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/14
 */

/**
 * Database class with a singleton INSTANCE object.
 */
@Database(entities = [ScanHistory::class], version = 1, exportSchema = false)
abstract class ScanRoomDatabase : RoomDatabase() {

    abstract fun historyDao(): ScanHistoryDao

    companion object {
        @Volatile
        private var INSTANCE: ScanRoomDatabase? = null

        fun getDatabase(context: Context): ScanRoomDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ScanRoomDatabase::class.java,
                    "scan_history_database"
                )
                    // Wipes and rebuilds instead of migrating if no Migration object.
                    // Migration is not part of this codelab.
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}