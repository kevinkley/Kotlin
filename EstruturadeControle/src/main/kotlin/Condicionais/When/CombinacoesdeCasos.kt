package Condicionais.When

fun main(){
    whencomVirgulas()
    whencomIntervalos()
    whenExpressoesConstantes()
    whenUsoPadroes()
}

val valor: Any = 6
val dados = "B"

fun whencomVirgulas(){
    when(valor){
        1,2,3 -> println("É um número entre 1 e 3")
        4,5,6 -> println("É um número entre 4 e 6")
        else -> "error"
    }
}

fun whencomIntervalos(){
    when(valor){
        in 1..3 -> println("É um número entre 1 e 3")
        in 4..6 -> println("É um número entre 4 e 6")
        else -> "error"
    }
}

fun whenExpressoesConstantes(){
    when(dados){
        "A" -> println("É a letra A")
        "B" -> println("É a letra B")
        else -> println("É outra letra")
    }
}

fun whenUsoPadroes(){
    val resultado = when(valor){
        is String -> "É uma String"
        is Int -> "É um Int"
        else -> "Tipo desconhecido"
    }
    println(resultado)
}