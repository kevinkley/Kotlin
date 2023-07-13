package Condicionais


val valor = readLine().toBoolean()

fun main() {
    //Expressão ternaria
    val condicional = if (valor) "Verdadeiro" else "Falso"
    println(condicional)
}