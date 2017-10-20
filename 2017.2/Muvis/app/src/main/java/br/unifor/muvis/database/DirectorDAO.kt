package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvis.entity.Category
import br.unifor.muvis.entity.Director

class DirectorDAO(context: Context) : GenericDAO<Director>(context, "directors") {

    override fun getModelByCursor(queryResult: Cursor): Director {

        val id = queryResult.getLong(queryResult.getColumnIndex("_id"))
        val name = queryResult.getString(queryResult.getColumnIndex("name"))
        val nationality = queryResult.getString(queryResult.getColumnIndex("nationality"))

        return Director(id, name, nationality)
    }

    override fun getContentValues(obj: Director): ContentValues {
        val values = ContentValues()
        values.put("name", obj.name)
        values.put("nationality", obj.nationality)

        return values
    }

}