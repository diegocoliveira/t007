package br.unifor.muvis.entity

data class Actor(override val id: Long, val name: String, val quantityOFOscars: Int, val movies: Set<Movie>) : Model