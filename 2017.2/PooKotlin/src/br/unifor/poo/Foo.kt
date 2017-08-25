package br.unifor.poo

interface Foo {

    val x:String

    fun test(a: String, b: Int): Double{
        return (a.toInt() + b).toDouble()
    }

}