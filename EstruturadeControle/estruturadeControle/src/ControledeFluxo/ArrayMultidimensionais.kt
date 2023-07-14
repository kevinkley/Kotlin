package ControledeFluxo

fun main(){
    arrayMultidimensionais()
}

fun arrayMultidimensionais(){
    val array = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    for(externo in array){
        for(interno in externo){
            print("$interno ")
        }
        println()
    }
}