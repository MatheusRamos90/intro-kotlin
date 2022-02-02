fun main() {
    println(calcularBonus("Desenvolvedor", 7550.30f))
}

fun calcularBonus(cargo: String, salario: Float): Float {
    // ternario
    val str = if (salario > 0) "tem salário" else "não tem salário ainda"
    println(str)

    // elvis
    val valueInt: Int? = null // previne nullpointer exception
    val valueIntOp: Int = valueInt ?: 100 // se o valor for nulo atribua 100
    println(valueIntOp)

    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente") {
        salario * 0.5f
    } else {
        salario * 2
    }
}