package br.unifor.banco

class ContaSalario(numero: Int) : ContaCorrente(numero) {

    init {
        adicionarChequeEspecial(0.0)
    }

}