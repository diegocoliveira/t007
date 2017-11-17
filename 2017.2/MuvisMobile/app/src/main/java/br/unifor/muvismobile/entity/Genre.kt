package br.unifor.muvismobile.entity

data class Genre(override val id: Long, val name: String, val description: String):IEntity {
    constructor(name: String, description: String) : this(0, name, description)
}