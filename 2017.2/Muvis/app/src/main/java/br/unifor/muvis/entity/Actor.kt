package br.unifor.muvis.entity

data class Actor(val id:Long, val name:String, val quantityOFOscars:Int, val movies:Set<Movie>)