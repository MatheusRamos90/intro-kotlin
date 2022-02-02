fun main() {
    calcular(10, 20, 30)

    println(hello2("Matheus"))
    println(isMaiorIdade(20))
}

fun hello(nome: String): String {
    return "Meu nome é: $nome"
}

fun hello2(nome: String) = "Meu nome é: $nome"

fun isMaiorIdade(idade: Int) = idade > 18

fun calcular(a: Int, b: Int, c: Int) {
    println("A soma dos parâmetros é: ${a + b + c}")
}
