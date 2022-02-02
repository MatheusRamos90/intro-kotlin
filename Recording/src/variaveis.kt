fun main() {
    println("Hello World!")

    // inferido automaticamente
    var nome01 = "Matheus"
    var idade01 = 30.0800
    var isMale01 = true
    var char01 = '4'

    // tipados manualmente
    var nome02: String = "Matheus"
    var idade02: Double = 30.0800
    var isMale02: Boolean = true
    var char02: Char = '2'

    // variáveis mutáveis
    var carro001 = "Ferrari"
    carro001 = "Mercedes"

    // variáveis imutáveis
    val carro0001 = "Volkswagen"

    // concatenação
    println("Concatenando $carro0001 e $carro001")
}

class Variaveis() {
    lateinit var teste: String //não recebe valores iniciais, os valores são carregados ao longo do processo

    fun initValores() {
        teste = "Test"
    }
}