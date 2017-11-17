package br.unifor.muvismobile.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvismobile.entity.Genre

class GenreDAO(context: Context) : GenericDAO<Genre>(context, "genres") {

    override fun getContentValuesFromEntity(obj: Genre): ContentValues {
        val contentValues = ContentValues()

        contentValues.put("name", obj.name)
        contentValues.put("description", obj.description)

        return contentValues
    }

    override fun createEntityFromCursor(cursor: Cursor): Genre {
        return Genre(
                cursor.getLong(cursor.getColumnIndex("_id")),
                cursor.getString(cursor.getColumnIndex("name")),
                cursor.getString(cursor.getColumnIndex("description")))
    }

}