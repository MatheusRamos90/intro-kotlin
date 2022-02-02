fun main() {
    media(8f, 7f, 6f, 8f, 10f)
    media(8f, 7f, 6f)

    recebeQualquerTipo(true, "Bola", 5f, 1000.00, 2)
}

fun <T> recebeQualquerTipo(vararg params: T) {
    for (param in params)
        println(param)
}

fun media(vararg notas: Float) {
    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A média das notas é: $soma")
    }
}