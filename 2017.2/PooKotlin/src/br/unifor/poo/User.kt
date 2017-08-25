package br.unifor.poo

abstract class User(val name: String, val address: String, override val x: String) : Foo  {

    val y:Double = 0.0

    abstract fun createUser()

    fun print(): String {
        return "[$name, $address]"
    }

}