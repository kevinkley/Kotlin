package ControledeFluxo

fun main(){
    variosInteraveis()
}

fun variosInteraveis(){
    val lista1 = listOf("Kevin", "Maria", "Pedro")
    val lista2 = listOf("Kley", "souza", "Santos")

    for((nome, sobrenome) in lista1.zip(lista2)){
        println("$nome $sobrenome")
    }

    for(indice in lista1.indices){
        println("nome $indice e ${lista1[indice]}")
    }

    val numeros = listOf(1, 2, 3, 4, 5)
    for (indice in numeros.indices) {
        println("Número no índice $indice é ${numeros[indice]}")
    }
}