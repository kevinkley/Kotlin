package ControledeFluxo

fun main(){
    estruraFor()
}

fun estruraFor(){
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (x in array.iterator()){
        var receberoX = x
        receberoX = receberoX + 2

        println(receberoX)

        if(receberoX in 1..6 step 2) {
            println("O valor de x é $receberoX")
        }
    }
}