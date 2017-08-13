package br.unifor.dispmoveis.lista01

/**
 * Questão 1.
 * Faça um algoritmo que lê 3 números e mostra a soma dos 2 maiores dentre estes números.
 * Considere que o usuário pode fornecer 2 ou mais números iguais. O resultado só deve
 * ser mostrado uma única vez.
 * Ex.:
 *      {3, 5, 1} → mostrar 8;
 *      {5, 3, 5} → mostrar 10;
 *      {4, 3, 3} → mostrar 7;
 *      {3, 3, 3} → mostrar 6.
 */
fun main(args: Array<String>) {

    // Cria um array de três posições com zeros
    val numbers = arrayOf(0, 0, 0)

    // Laço de repetição que irá solicitar do usuário trêsnúmeros
    for (i in 0..2) {
        println("Digite um número: ")
        numbers[i] = readLine()?.toInt() ?: 0
    }

    // Ordena os números recebidos pelo usuário
    numbers.sort()

    // Soma os dois maiores
    println("A soma dos números ${numbers[2]} e ${numbers[1]} é ${numbers[2] + numbers[1]}")

}