package Condicionais.If_e_Else

fun main(){
    whenComArgumento()

    val a = 10
    val b = 20
    val max = if(a > b) "maior" else "menor"
    val min = if(a < b) "maior" else "menor"
    println("maximo = ${max}")
    println("minimo = ${min}")

    val idade = 30
    val faixa = 18
    val entrada = if (idade >= faixa) "adulto" else "criança"
    println("entrada = ${entrada}")
}

fun whenComArgumento(){
    val dados = 3

    when(dados){
        in 1..3 -> println("O valor está entre 1 e 5")
        in 4..6 -> println("O valor está entre 4 e 6")
        else -> println("O valor é um inteiro")
    }
}
