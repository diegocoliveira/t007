package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvis.entity.Category
import br.unifor.muvis.entity.Model


abstract class GenericDAO<T : Model>(context: Context, tableName: String) {

    protected val TABLE_NAME = tableName
    protected val db = MuvisDatabase(context).writableDatabase

    fun insert(obj: T) {
        db.insert(TABLE_NAME, null, getContentValues(obj))
    }

    fun update(obj: T) {
        db.update(TABLE_NAME, getContentValues(obj), "_id = ?", arrayOf(obj.id.toString()))
    }

    fun delete(obj: T) {
        db.delete(TABLE_NAME, "_id = ?", arrayOf(obj.id.toString()))
    }

    fun find(id: Long): T? {
        val queryResult = db.query(TABLE_NAME, null, "_id = ?", arrayOf(id.toString()), null, null, null, null)
        return if (queryResult.count > 0) {

            queryResult.moveToFirst()

            getModelByCursor(queryResult)

        } else {
            null
        }
    }

    fun findAll(): List<T> {
        val queryResult = db.query(TABLE_NAME, null, null, null, null, null, "_id DESC", null)

        val list = ArrayList<T>()

        if (queryResult.count > 0) {

            queryResult.moveToFirst()

            do {

                list.add(getModelByCursor(queryResult))

            } while (queryResult.moveToNext())

        }

        return list
    }

    abstract fun getModelByCursor(queryResult: Cursor): T

    abstract fun getContentValues(obj: T): ContentValues

}