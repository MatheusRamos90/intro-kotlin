class Carro(var cor: String, var anoFabricacao: Int, var dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    val carro = Carro("Preto", 2003, Dono("Matheus", 31))

    println(carro.cor)
    println(carro.anoFabricacao)
    println(carro.dono)
}