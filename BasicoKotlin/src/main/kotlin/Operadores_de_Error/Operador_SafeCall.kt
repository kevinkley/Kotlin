package Operadores_de_Error

fun main(){
    val pessoa: Pessoa? = "kevin".let { Pessoa(it, 27) }
    val nome = obterNome(pessoa)
    println("O nome da pessoa é $nome")
}

data class Pessoa(val nome: String, val idade: Int)

fun obterNome(pessoa: Pessoa?): String?{
    return pessoa?.nome
}