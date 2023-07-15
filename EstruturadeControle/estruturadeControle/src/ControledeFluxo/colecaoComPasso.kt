package ControledeFluxo

fun main(){
    //pulacomStepSring()
    pulacomStepNumerico()
}

fun pulacomStepSring(){
    println("--------------------------------------------------")
    val dados = arrayOf("Kevin", "Maria", "João", "Pedro", "Ana")
    for(x in 0..dados.size step 2){
        val elemento = dados[x]//Acessado o indice percorrido no for
        print(elemento + "")
    }
}

fun pulacomStepNumerico(){
    val valor = intArrayOf(1,2,3,4,5)
    for(num in 0..valor.size step 2){
        val receber = valor[num] //Acessado o indice percorrido no for
        println("Atribuido a uma variavel e a estrutura dentro de [] da variavel do array $receber")
        println("-------------------------------------------")
        println("Direto do array = ${num}")
    }
}