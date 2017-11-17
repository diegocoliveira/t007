package br.unifor.muvismobile.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvismobile.entity.Director

class DirectorDAO(context: Context) : GenericDAO<Director>(context, "directors") {

    override fun getContentValuesFromEntity(obj: Director): ContentValues {
        val contentValues = ContentValues()

        contentValues.put("name", obj.name)
        contentValues.put("gender", obj.gender)
        contentValues.put("age", obj.age)
        contentValues.put("nationality", obj.nationality)

        return contentValues
    }

    override fun createEntityFromCursor(cursor: Cursor): Director {

        val movieDao = MovieDAO(context)

        return Director(
                cursor.getLong(cursor.getColumnIndex("_id")),
                cursor.getString(cursor.getColumnIndex("name")),
                cursor.getString(cursor.getColumnIndex("gender")),
                cursor.getInt(cursor.getColumnIndex("age")),
                cursor.getString(cursor.getColumnIndex("nationality")),
                movieDao.findMoviesByDirectorId(cursor.getLong(cursor.getColumnIndex("_id")))
        )
    }

}