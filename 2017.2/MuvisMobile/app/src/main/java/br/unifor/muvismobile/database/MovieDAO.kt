package br.unifor.muvismobile.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.unifor.muvismobile.entity.Actor
import br.unifor.muvismobile.entity.Director
import br.unifor.muvismobile.entity.Movie

class MovieDAO(context: Context) : GenericDAO<Movie>(context, "movies") {

    override fun getContentValuesFromEntity(obj: Movie): ContentValues {
        val contentValues = ContentValues()

        contentValues.put("name", obj.name)
        contentValues.put("launch_year", obj.launchYear)
        contentValues.put("description", obj.description)
        contentValues.put("director_id", obj.director.id)
        contentValues.put("genre_id", obj.genre.id)

        return contentValues
    }

    override fun createEntityFromCursor(cursor: Cursor): Movie {

        val directorDAO = DirectorDAO(context)
        val genreDAO = GenreDAO(context)

        val director = directorDAO.find(cursor.getLong(cursor.getColumnIndex("director_id")))
        val genre = genreDAO.find(cursor.getLong(cursor.getColumnIndex("genre_id")))

        return Movie(
                cursor.getLong(cursor.getColumnIndex("_id")),
                cursor.getString(cursor.getColumnIndex("name")),
                cursor.getInt(cursor.getColumnIndex("launch_year")),
                cursor.getString(cursor.getColumnIndex("description")),
                director!!,
                genre!!,
                ArrayList<Actor>()
        )
    }

    fun findMoviesByActorId(actorId: Long): List<Movie> {

        val list = ArrayList<Movie>()

        val cursor = db.query(
                "movies_actors",
                null,
                "actor_id = ?",
                arrayOf(actorId.toString()),
                null,
                null,
                "actor_id ASC",
                null)

        if (cursor.count > 0) {

            cursor.moveToFirst()
            do {
                list.add(createEntityFromCursor(cursor))
            } while (cursor.moveToNext())

        }

        return list

    }

    fun findMoviesByDirectorId(directorId:Long):List<Movie>{

        val list = ArrayList<Movie>()

        val cursor = db.query(
                "movies",
                null,
                "director_id = ?",
                arrayOf(directorId.toString()),
                null,
                null,
                "movies_id ASC",
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