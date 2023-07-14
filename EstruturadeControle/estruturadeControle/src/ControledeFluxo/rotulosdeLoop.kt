package ControledeFluxo

fun main(){
    rotulodeLoop()
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
