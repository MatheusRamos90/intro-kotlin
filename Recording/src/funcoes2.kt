fun main() {
    endereco(
        cidade = "Blumenau",
        numero = 1325,
        rua = "Av Brasil",
        cep = "8542000",
        estado = "SC"
    ) // passando parâmetros nomeados
    endereco("Av Brasil", "Blumenau", "SC", "8558600", 1562)
}

fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) {
    println("Rua: $rua")
    println("Cidade: $cidade")
}