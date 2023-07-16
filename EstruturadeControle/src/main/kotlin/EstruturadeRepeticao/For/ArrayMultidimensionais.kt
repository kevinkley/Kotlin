package EstruturadeRepeticao.For

fun main(){
    arrayMultidimensionais()

    //val arrays = Array(5){a -> "${a + 1} + kevin" }
    //val arraysOf = arrayOf(1,2,3,4,5)
}

fun arrayMultidimensionais(){
    val array = arrayOf(
        charArrayOf(' ', ' ', ' '),
        charArrayOf(' ', ' ', ' '),
        charArrayOf(' ', ' ', ' '),
    )

    array[0][1] = 'X'

    for(externo in array){
        for(interno in externo){
            print("$interno ")
        }
        println()
    }

    if(array[0][1] == 'X'){
        println("X venceu")
    }
}