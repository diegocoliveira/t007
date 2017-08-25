package br.unifor.dispmoveis.lista01

/**
 * Questão 3.
 * Um hotel cobra R$ 60 a diária e mais uma taxa adicional de: R$ 5,50 por diária, se o número de diárias for
 * maior que 10; R$ 6,00 por diária, se o número de diárias for igual a 10; R$ 8,00 por diária, se o número de
 * diárias for menor que 10. Faça um algoritmo que, dado um cliente e seu número de diárias, mostra o nome
 * do cliente e sua conta. Utilize seleção encadeada.
 */
fun main(args: Array<String>) {

    val clientName:String
    val clientDaily:Int
    var clientBill = 0.0

    println("Digite o nome do cliente:")
    clientName = readLine() ?: ""


    println("Digite a quatidade de diárias:")
    clientDaily = readLine()?.toInt() ?: 0

    when{
        clientDaily > 10 -> clientBill = 65.50 * clientDaily
        clientDaily ==10 -> clientBill = 66.00 * clientDaily
        clientDaily < 10 -> clientBill = 68.00 * clientDaily
    }

    println("A fatura do cliente $clientName é R$ ${"%.2f".format(clientBill)}")

}