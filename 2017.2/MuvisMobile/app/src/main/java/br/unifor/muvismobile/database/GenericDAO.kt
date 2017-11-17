package br.unifor.muvismobile.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvismobile.entity.IEntity

abstract class GenericDAO<T : IEntity>(protected val context: Context, protected val tableName: String) {

    protected val db = MuvisDatabase(context).writableDatabase

    fun insert(obj: T): Long {
        return db.insert(tableName, null, getContentValuesFromEntity(obj))
    }

    fun update(obj: T): Int {
        return db.update(tableName, getContentValuesFromEntity(obj), "_id = ?", arrayOf(obj.id.toString()))
    }

    fun delete(obj: T): Int {
        return db.delete(tableName, "_id = ?", arrayOf(obj.id.toString()))
    }

    fun find(id: Long): T? {

        val cursor = db.query(tableName, null, "_id = ?", arrayOf(id.toString()), null, null, null, null)

        return if (cursor.count > 0) {
            cursor.moveToFirst()
            createEntityFromCursor(cursor)
        } else {
            null
        }

    }

    fun findAll(): List<T> {

        val list = ArrayList<T>()
        val cursor = db.query(tableName, null, null, null, null, null, "_id ASC", null)

        if (cursor.count > 0) {
            cursor.moveToFirst()
            do {
                list.add(createEntityFromCursor(cursor))
            } while (cursor.moveToNext())
        }

        return list

    }

    abstract fun getContentValuesFromEntity(obj: T): ContentValues

    abstract fun createEntityFromCursor(cursor: Cursor): T

}