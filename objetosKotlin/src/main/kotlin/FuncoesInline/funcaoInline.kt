package FuncoesInline

fun main(){
    val resultado = calcula(10, 20)
    println(resultado)
}

inline fun calcula(a: Int, b: Int): Int{
    return a + b
}