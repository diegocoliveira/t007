package br.unifor.dispmoveis.lista01

/**
 * Questão 2.
 * Dois times estão disputando a final do campeonato nacional de basquete,
 * o Time A e o Time B. Faça um algoritmo que, dado como entrada a quantidade
 * de cestas de 1, 2 e 3 pontos de cada um dos dois times, indica o time
 * vencedor ou, em caso de empate, mostra a mensagem “Empate”.
 */

fun main(args: Array<String>) {

    val teamName = listOf<String>("Time A", "Time B")
    val teamPoints = arrayOf(0, 0)

    // Laço que realiza a leitura dos pontos
    for (i in 0..1) {

        println("Digite a quantidade de cestas de 1, 2 e 3 " +
                "pontos que o ${teamName[i]} conquistou durante a partida (separados por espaços)")

        val points = readLine() ?: "0 0 0"

        val pointArray = points.split(" ")
        for (j in 1..3) {
            teamPoints[i] += pointArray[j - 1].toInt() * j
        }

    }

    // Verificação de empate ou do time vencedor
    if (teamPoints[0] === teamPoints[1]) {
        println("Empate!")
    } else {
        if (teamPoints[0] > teamPoints[1])
            println("Time A venceu: Time A ${teamPoints[0]} x Time B ${teamPoints[1]}")
        else
            println("Time B venceu: Time A ${teamPoints[0]} x Time B ${teamPoints[1]}")
    }

}