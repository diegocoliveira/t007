package br.unifor.banco

class Banco {

    val clientes: MutableList<Usuario>

    init {
        clientes = ArrayList()
        clientes.add(Usuario("Bruno", "1234", TipoConta.CONTA_CORRENTE, 1))
        clientes.add(Usuario("Joaozinho", "1234", TipoConta.CONTA_POUPANCA, 2))
        clientes.add(Usuario("Zezinho", "1234", TipoConta.CONTA_SALARIO, 3))
        clientes.add(Usuario("Sicrano", "1234", TipoConta.CONTA_CORRENTE, 4))
        clientes.add(Usuario("Beltrano", "1234", TipoConta.CONTA_POUPANCA, 5))
        clientes.add(Usuario("Fulano", "1234", TipoConta.CONTA_CORRENTE, 6))
    }

    fun imprimirRelatorio() {
        for (clinte in clientes) {

            val tipoConta = when(clinte.conta){
                is ContaCorrente -> "Conta Corrente"
                is ContaPoupanca -> "Conta Poupança"
                is ContaSalario -> "Conta Salario"
                else -> "Não especificada"
            }

            println("Nome: ${clinte.nome}, Tipo de Conta: $tipoConta, Saldo: ${clinte.conta.saldo()}")

        }
    }


}