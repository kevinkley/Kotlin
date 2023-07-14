package ControledeFluxo

fun main(){

    val list = listOf(1 ,2 ,3 ,4 ,5, 6, 7, 8, 9, 10 )
    for(x in list){
        for(y in x..10){
            print("$y ")
        }
        println()
    }
}

fun rotulodeLoop(){
    val lista = listOf("João", "Maria", "Pedro")
    loop@for(x in lista){
        for(y in 1..3 step "Maria".length){
                if(x == "Maria") break@loop
        }
        println(x)
    }
}
