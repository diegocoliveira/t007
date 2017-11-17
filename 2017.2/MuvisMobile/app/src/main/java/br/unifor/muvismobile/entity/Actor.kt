package br.unifor.muvismobile.entity

data class Actor(override val id: Long, val name: String, val gender: String, val age: Int, val nationality: String, val movies: List<Movie>) : IEntity {
    constructor(name: String, gender: String, age: Int, nationality: String, movies: List<Movie>) : this(0, name, gender, age, nationality, movies)
    constructor(name: String, gender: String, age: Int, nationality: String) : this(0, name, gender, age, nationality, ArrayList<Movie>())
}