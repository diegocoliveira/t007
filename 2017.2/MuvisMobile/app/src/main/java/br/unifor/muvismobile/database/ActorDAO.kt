package br.unifor.muvismobile.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvismobile.entity.Actor


class ActorDAO(context: Context) : GenericDAO<Actor>(context, "actors") {

    private val movieDAO = MovieDAO(context)

    override fun getContentValuesFromEntity(obj: Actor): ContentValues {
        val contentValues = ContentValues()

        contentValues.put("name", obj.name)
        contentValues.put("gender", obj.gender)
        contentValues.put("age", obj.age)
        contentValues.put("nationality", obj.nationality)

        return contentValues
    }

    override fun createEntityFromCursor(cursor: Cursor): Actor {
        return Actor(
                cursor.getLong(cursor.getColumnIndex("_id")),
                cursor.getString(cursor.getColumnIndex("name")),
                cursor.getString(cursor.getColumnIndex("gender")),
                cursor.getInt(cursor.getColumnIndex("age")),
                cursor.getString(cursor.getColumnIndex("nationality")),
                movieDAO.findMoviesByActorId(cursor.getLong(cursor.getColumnIndex("_id")))
        )
    }

    fun findActorsByMovieId(movieId:Long):List<Actor>{

        val list = ArrayList<Actor>()

        val cursor = db.query(
                "movies_actors",
                null,
                "movie_id = ?",
                arrayOf(movieId.toString()),
                null,
                null,
                "movie_id ASC",
                null)

        if (cursor.count > 0) {

            cursor.moveToFirst()
            do {
                list.add(createEntityFromCursor(cursor))
            } while (cursor.moveToNext())

        }

        return list

    }

}