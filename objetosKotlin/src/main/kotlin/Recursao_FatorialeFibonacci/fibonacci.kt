package Recursao_FatorialeFibonacci

fun main(){
    println(fibonacci(9))
}

fun fibonacci(n: Int): Int {
    // Casos base
    if (n == 0 || n == 1) {
        return n
    }

    // Casos recursivos
    return fibonacci(n - 1) + fibonacci(n - 2)
}
