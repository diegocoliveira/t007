package br.unifor.banco

class ContaPoupanca(numero:Int): Conta(numero) {

    override fun saldo(): Double {
        return saldo;
    }

    override fun saque(valor: Double) {
        if(saldo > valor){
            saldo -= valor
        }
    }

}