package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvis.entity.Category

class CategoryDAO(context: Context) : GenericDAO<Category>(context, "categories") {

    override fun getContentValues(obj: Category): ContentValues {

        val values = ContentValues()
        values.put("name", obj.name)

        return values

    }

    override fun getModelByCursor(queryResult: Cursor): Category {

        val id = queryResult.getLong(queryResult.getColumnIndex("_id"))
        val name = queryResult.getString(queryResult.getColumnIndex("name"))

        return Category(id, name)

    }

}