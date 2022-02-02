fun main() {
    println(arrayOf(1, 2, 3, 4, 5))
    println(arrayOf(true, 4f, 123.99, "Matheus").map { c -> println(c) })

    val str = "Lorem ipsum"
    println(str.contains("bla"))
    println(str.startsWith("l", true)) // l ou L passará
    println(str.startsWith("L"))

}