fun main() {
//    val lista = listOf(1, 2, 3, 4, 5, 6)
//    val lista = mutableListOf(1, 2, 3, 4, 5, 6)
//    val listaDesordenada = mutableListOf(5, 3, 1, 4, 6, 2)
//    var setNumeros = setOf(1, 2, 3, 4, 2, 1) // setOf - não exibirá valores repetidos
    var mapNomes = mutableMapOf("Matheus" to 31, "Lucas" to 27)
//    val primeiroValorLista = lista.first()
//    val ultimoValorLista = lista.last()
//    val apenasParesLista = lista.filter { it % 2 == 0 }

    println(mapNomes)
    // atribuindo valores ao map
    mapNomes.put("João", 28)
    mapNomes["Lucas"] = 29
    println(mapNomes)

    //removendo do map
    mapNomes.remove("João")
    println(mapNomes)

    // adicionado valor se não existir no map
    mapNomes.putIfAbsent("João", 28)
    println(mapNomes)

//    println(setNumeros)
//    println(setNumeros.contains(2))

//    lista.add(7)

//    listaDesordenada.sort() // ordena lista
//    println(listaDesordenada)
//    listaDesordenada.shuffle() // embaralha lista
//    println(listaDesordenada)

//    lista.forEach {
//        println(it)
//    }

//    lista.removeAt(2) // remove o valor da posição 2 da lista/array
//    lista.remove(5) // remove o número 5 da lista
//
//    for (num in lista) {
//        print(num)
//    }

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(5))
//    println(primeiroValorLista)
//    println(ultimoValorLista)
//    println(apenasParesLista)
}