package br.unifor.muvis.database

import android.content.Context
import android.graphics.ColorSpace
import br.unifor.muvis.entity.Model


abstract class GenericDAO<T : Model>(context: Context) {

    abstract fun insert(obj: T)

    abstract fun update(obj: T)

    abstract fun delete(obj: T)

    abstract fun find(id: Long): T

    abstract fun findAll(): List<T>

}