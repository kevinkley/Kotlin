package ControledeFluxo

fun main(){
    val lista = listOf("João", "Maria", "Pedro")


    lista.forEach { println(it to "kley") }

    for((indice, nome) in lista.withIndex()){
        println("$indice - $nome")
    }
}