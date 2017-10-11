package br.unifor.muvis.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MuvisDatabase(context: Context) : SQLiteOpenHelper(context, "muvis.db", null, 1) {

    val context = context

    override fun onCreate(db: SQLiteDatabase?) {

        val createSql = context.assets.open("/db/create.sql")
        val sqls = createSql.bufferedReader().useLines { lines -> lines.forEach { db?.execSQL(it) } }

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}