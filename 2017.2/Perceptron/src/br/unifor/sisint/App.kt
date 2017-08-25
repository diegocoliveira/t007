package br.unifor.sisint

fun main(args: Array<String>) {

    val dataset = Array(4, { DoubleArray(3) })
    dataset[0] = doubleArrayOf(1.0, 1.0, 1.0)
    dataset[1] = doubleArrayOf(1.0, 0.0, 1.0)
    dataset[2] = doubleArrayOf(0.0, 1.0, 1.0)
    dataset[3] = doubleArrayOf(0.0, 0.0, 0.0)

    val perceptron = Perceptron(dataset, 0.00001)

    perceptron.networkTrainning()

    println("Teste: x1 = 1 e x2 = 1 y = ${perceptron.execute(1.0, 1.0)}")
    println("Teste: x1 = 1 e x2 = 0 y = ${perceptron.execute(1.0, 0.0)}")
    println("Teste: x1 = 0 e x2 = 1 y = ${perceptron.execute(0.0, 1.0)}")
    println("Teste: x1 = 0 e x2 = 0 y = ${perceptron.execute(0.0, 0.0)}")


}