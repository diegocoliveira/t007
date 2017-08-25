package br.unifor.sisint

import java.util.*

class Perceptron(val dataset: Array<DoubleArray>, val learningRate: Double = 0.5) {

    private var w: DoubleArray
    private val random: Random

    init {
        random = Random()
        w = DoubleArray(dataset[0].size, { random.nextDouble() })
        println("Vetor inicial w = ${printData(w)}")
    }

    fun networkTrainning() {

        var epoch = 0
        var error = true
        println("Inicializando o treinamento...")

        while (error) {

            error = false

            for (i in dataset) {

                var x = DoubleArray(i.size, { if (it == 0) -1.0 else i[it - 1] })

                var u = 0.0
                for (k in 0..i.size - 1) {
                    u += x[k] * w[k]
                }

                val y = ActivationFunctionsUtil.stepFunction(u)

                if (y !== i[i.size - 1]) {

                    for (k in 0..w.size - 1) {
                        w[k] = w[k] + learningRate * (i[i.size - 1] - y) * x[k]
                    }
                    error = true
                    break
                }

            }

            epoch += 1
            println("\tÉpoca $epoch")
            println("\tVetor w = ${printData(w)}\n")

        }

    }

    fun execute(vararg data: Double): Double {

        var x = DoubleArray(data.size + 1, { if (it == 0) -1.0 else data[it - 1] })

        var u = 0.0
        for (k in 0..x.size - 1) {
            u += x[k] * w[k]
        }

        return ActivationFunctionsUtil.stepFunction(u)

    }

    fun printData(w: DoubleArray): String {

        val sb = StringBuilder()

        sb.append("[")
        for (i in 0..w.size - 1) {
            sb.append(w[i])
            if (i !== w.size - 1)
                sb.append(", ")
        }
        sb.append("]")

        return sb.toString()

    }

}