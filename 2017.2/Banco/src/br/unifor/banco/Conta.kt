package br.unifor.banco

abstract class Conta(numero:Int) {

    val numero:Int
    var saldo:Double

    init {
        this.numero = numero
        this.saldo = 0.0
    }

    fun depositar(valor:Double){
        saldo += valor
    }

    abstract fun saldo():Double

    abstract fun saque(valor:Double)

}