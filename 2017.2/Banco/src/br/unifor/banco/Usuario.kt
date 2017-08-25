package br.unifor.banco

class Usuario(nome: String,senha: String,
              tipoConta: TipoConta, numeroConta:Int) {

    val nome:String
    val senha:String
    val conta: Conta

    init {

        this.nome = nome
        this.senha = senha

        when (tipoConta) {
            TipoConta.CONTA_CORRENTE -> conta = ContaCorrente(numeroConta)
            TipoConta.CONTA_POUPANCA -> conta = ContaPoupanca(numeroConta)
            TipoConta.CONTA_SALARIO -> conta = ContaSalario(numeroConta)
        }

    }

}