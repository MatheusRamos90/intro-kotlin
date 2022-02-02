class PrimeiraClasse(
    var nome: String, var documento: String, var idade: Int
) {
    companion object {
        fun criarComValoresPadrao(): PrimeiraClasse {
            return PrimeiraClasse("Matheus", "123456", 31)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): PrimeiraClasse {
            return PrimeiraClasse(segundaClasse.nome, segundaClasse.documento, segundaClasse.idade)
        }
    }
}

class SegundaClasse (
    var nome: String, var documento: String, var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("João", "654321", 25)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("Mike", "147852", 28).criarComValoresPadrao()

    var primeiraClasse = PrimeiraClasse.criarAPartirDeSegundaClasse(segundaClasse)

    println(primeiraClasse)
}