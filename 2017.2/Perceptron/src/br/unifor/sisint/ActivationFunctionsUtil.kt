package br.unifor.sisint

class ActivationFunctionsUtil {

    companion object {

        fun stepFunction(u: Double): Double {
            return if (u >= 0) 1.0 else 0.0
        }

    }

}