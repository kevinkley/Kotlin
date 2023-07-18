package EstruturadeRepeticao.For.Exercicios

fun main(){
    println("A média é: ")
    calculaaMedia()

    println("-----------------------------")
    calculaMultiplicacao()

    println("-----------------------------")
    calculaDivisao()
}

fun calculaaMedia(){
    var soma = 0
    val quantidade = arrayOf(1,2,3,4,5,6,7,8,9,10).size

    for(i in 1..quantidade){
        soma = soma + i
        val media = soma / quantidade
        println("$i A média é: $media")
    }
}

fun calculaMultiplicacao() {
    var multi = 10
    val multiplos = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    for (xx in multiplos) {
        multi *= xx
        println("$xx A multiplicação é: $multi")
    }
}

fun calculaDivisao(){
    val divisores = intArrayOf(1,2,3,4,5,6,7,8,9,10).size
    var div = 100000

    for (xxx in 1..divisores) {
     div /= xxx
     println("$xxx A divisão é: ${div.toFloat()}")}
}