package com.zgo.lib.data.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update


/*
 * https://medium.com/androiddevelopers/7-pro-tips-for-room-fbadea4bfbd1
 *
 * https://gist.github.com/florina-muntenescu/1c78858f286d196d545c038a71a3e864
 *
 *
 * MigrationsSample
 * https://github.com/android/architecture-components-samples/blob/main/PersistenceMigrationsSample/app/src/room3/java/com/example/android/persistence/migrations/UsersDatabase.java
 * 
 * @author: zhhli
 * @date: 22/8/15
 */
interface BaseDao<T> {

    /**
     * Insert an object in the database.
     *
     * @param obj the object to be inserted.
     */
    @Insert
    suspend fun insert(obj: T)

    /**
     * Insert an array of objects in the database.
     *
     * @param obj the objects to be inserted.
     */
    @Insert
    suspend fun insert(vararg obj: T)

    @Insert
    @JvmSuppressWildcards
    suspend fun insert(items: List<T>)

    /**
     * Update an object from the database.
     *
     * @param obj the object to be updated
     */
    @Update
    suspend fun update(obj: T)

    /**
     * Delete an object from the database
     *
     * @param obj the object to be deleted
     */
    @Delete
    suspend fun delete(obj: T)
}

//
//@Transaction
//suspend inline fun <reified T> BaseDao<T>.insertOrUpdate(item: T) {
//    if (insert(item) != -1L) return
//    update(item)
//}