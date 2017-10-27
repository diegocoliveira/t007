package br.unifor.muvis.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MuvisDatabase(context: Context) :
        SQLiteOpenHelper(context, DatabaseUtil.DATABASE_NAME, null, DatabaseUtil.DATABASE_VERSION) {

    val context = context

    override fun onCreate(db: SQLiteDatabase?) {
        executeSql(db, "db/create.sql")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        executeSql(db, "db/update.sql")
    }

    private fun executeSql(db: SQLiteDatabase?, path:String) {
        val createSql = context.assets.open(path)
        createSql.bufferedReader().useLines { lines ->
            lines.forEach {
                db?.execSQL(it) }
        }
    }

}