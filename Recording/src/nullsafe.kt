fun main() {

    val str: String? = null
    println(str?.length) // aceito nulo mesmo assim

    println(str!!.length) // assumo o risco mesmo vindo uma exceção
}