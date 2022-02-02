fun main() {
    println(operador(10, 10, "Soma"))
    println(operador(10, 10, "Subtracao"))
    println(comecaComOi("oi pessoal, tudo bem?"))
}

fun operador(a: Int, b: Int, operator: String) {

    // 1º
//    return when (operator) {
//        "Soma" -> a + b
//        "Subtracao" -> {
//            a - b
//        } else -> {
//            println("Operação incorreta")
//            0
//        }
//    }

    // 2°
//    when (operator) {
//        "Soma" -> return a + b
//        "Subtracao" -> {
//            return a - b
//        } else -> {
//            println("Operação incorreta")
//            return 0
//        }
//    }

    when {
        a > 0 && b > 0 -> {
            println("Variáveis a e b maiores que zero")
        }
    }

    when (a) {
        in 1..99 -> println("A variável 'a' está entre 100")
    }

}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}
