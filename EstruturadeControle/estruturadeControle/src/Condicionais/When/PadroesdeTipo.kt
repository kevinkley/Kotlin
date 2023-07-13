package Condicionais.When

fun main(){
    val valor: Any = 2

    when(valor){
        is String -> println("É uma String")
        is Int -> println("É um Inteiro")
        is Boolean -> println("É um Booleano")
        else -> println("Não sei o que é")
    }
}