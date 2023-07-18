package EstruturadeRepeticao.For.Exercicios

fun main(){
    tabuadaMultipla()
}

fun tabuadaMultipla(){
    var multipla = readln()!!.toInt()

    val array = arrayOf(1,2,3,4,5,6,7,8,9,10).size

    for(x in 1..array){
        val resultado = multipla * x
        println("$multipla * $x = $resultado")
    }
}