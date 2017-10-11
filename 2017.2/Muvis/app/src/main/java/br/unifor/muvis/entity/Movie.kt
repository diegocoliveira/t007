package br.unifor.muvis.entity

data class Movie(val id:Long, val name:String, val year:Int, val director:Director, val actors:Set<Actor>)