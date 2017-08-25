package br.unifor.banco

open class ContaCorrente(numero: Int) : Conta(numero) {

    var chequeEspecial: Double

    init {
        this.chequeEspecial = 0.0
    }

    fun adicionarChequeEspecial(valor: Double) {
        this.chequeEspecial = valor
    }

    override fun saldo(): Double {
        return chequeEspecial + saldo
    }

    override fun saque(valor: Double) {
        if (chequeEspecial + saldo > valor) {
            val aux = saldo - valor

            if (aux < 0) {
                saldo = 0.0
                chequeEspecial += aux
            } else {
                saldo -= valor
            }
        }
    }

}