package br.unifor.muvis.database

import android.content.ContentValues
import android.content.Context
import br.unifor.muvis.entity.Category

class CategoryDAO(context: Context) : GenericDAO<Category>(context) {

    val TABLE_NAME = "categories"
    val db = MuvisDatabase(context).writableDatabase

    override fun insert(obj: Category) {

        val values = ContentValues()
        values.put("name", obj.name)

        db.insert(TABLE_NAME, null, values)

    }

    override fun update(obj: Category) {

        val values = ContentValues()
        values.put("name", obj.name)

        db.update(TABLE_NAME, values, "_id = ?", arrayOf(obj.id.toString()))

    }

    override fun delete(obj: Category) {

        db.delete(TABLE_NAME, "_id = ?", arrayOf(obj.id.toString()))

    }

    override fun find(id: Long): Category {

        val queryResult = db.query(TABLE_NAME, null, "_id = ?", arrayOf(id.toString()), null, null, null, null)

        val result = if (queryResult.count > 0) {

            queryResult.moveToFirst()

            val id = queryResult.getLong(queryResult.getColumnIndex("_id"))
            val name = queryResult.getString(queryResult.getColumnIndex("name"))

            Category(id, name)

        } else {
            Category(0, "")
        }

        return result

    }

    override fun findAll(): List<Category> {

        val queryResult = db.query(TABLE_NAME, null, null, null, null, null, "_id DESC", null)
        val list = ArrayList<Category>()

        if (queryResult.count > 0) {

            queryResult.moveToFirst()

            do {

                val id = queryResult.getLong(queryResult.getColumnIndex("_id"))
                val name = queryResult.getString(queryResult.getColumnIndex("name"))

                list.add(Category(id, name))

            } while(queryResult.moveToNext())

        }

        return list

    }

}