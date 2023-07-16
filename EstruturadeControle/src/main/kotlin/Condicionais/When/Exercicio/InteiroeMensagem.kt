package Condicionais.When.Exercicio

fun main(){
    numeroInteiroeMensagem()
}

fun numeroInteiroeMensagem(){
    val numero = 0

    val resultado = when{
        numero > 0 -> "Número positivo"
        numero == 0 -> "Número neutro"
        else -> "Número negativo"
    }
    println(resultado)
}