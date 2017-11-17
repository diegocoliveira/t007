package br.unifor.muvismobile.entity


data class Movie(override val id: Long, val name: String, val launchYear: Int, val description: String, val director: Director, val genre: Genre, val actors: List<Actor>) : IEntity {
    constructor(name: String, launchYear: Int, description: String, director: Director, genre: Genre, actors: List<Actor>) : this(0, name, launchYear, description, director, genre, actors)
    constructor(name: String, launchYear: Int, description: String, director: Director, genre: Genre) : this(0, name, launchYear, description, director, genre, ArrayList<Actor>())
}