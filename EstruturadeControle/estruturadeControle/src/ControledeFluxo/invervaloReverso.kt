package ControledeFluxo

fun main(){
    intervaloReverso()
    println(    )
    intervaloCrescente()
}

fun intervaloReverso(){
    for(i in 100 downTo 0 step 5){
        print("$i ")
    }
}

fun intervaloCrescente(){
    for(i in 0 until 100 step 5){
        print("$i ")
    }
}