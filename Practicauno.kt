fun main() {
    println("Ingrese el primer número:")
    val numerouno = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val numerodos = readLine()?.toDoubleOrNull()

    println("Ingrese la operación (+, -, *, /):")
    val operacion = readLine()

    calculate(numerouno, numerodos, operacion)
}

fun calculate(numerouno: Double?, numerodos: Double?, operacion: String?) {
    if (numerouno == null || numerodos == null || operacion == null) {
        println("Error: Ingrese números válidos y una operación válida.")
        return
    }

    val resultado = when (operacion) {
        "+" -> numerouno + numerodos
        "-" -> numerouno - numerodos
        "*" -> numerouno * numerodos
        "/" -> {
            if (numerodos == 0.0) {
                println("Error: División por cero.")
                return
            } else {
                numerouno / numerodos
            }
        }
        else -> {
            println("Error: Operación no válida.")
            return
        }
    }
    println("Resultado de la operación: $numerouno $operacion $numerodos = $resultado")
}


