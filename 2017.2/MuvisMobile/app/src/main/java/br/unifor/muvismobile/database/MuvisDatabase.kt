package br.unifor.muvismobile.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MuvisDatabase(val context: Context) : SQLiteOpenHelper(context, "muvis_mobile.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        executeSQL(db, "db/muvis_database_create.sql")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        executeSQL(db, "db/muvis_database_update.sql")
    }

    private fun executeSQL(db: SQLiteDatabase, path: String) {
        val sql = context.assets.open(path)
        sql.bufferedReader().forEachLine { if (!it.trim().isEmpty()) db.execSQL(it) }
    }

}