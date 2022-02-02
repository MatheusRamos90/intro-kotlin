fun main() {

    val str = "Matheus Ramos"
    for (s in str) {
        print("$s ")
    }

    println("\n ------")

    for (c in 1..100) {
        print("$c ")
    }

    println("\n ------")

    for (c in 1..100 step 5) {
        print("$c ")
    }

    println("\n --- DownTo ---")

    for (c in 100 downTo 1)
        print("$c ")
}