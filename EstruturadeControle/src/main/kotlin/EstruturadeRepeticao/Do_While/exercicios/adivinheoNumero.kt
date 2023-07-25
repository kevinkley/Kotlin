package EstruturadeRepeticao.Do_While.exercicios

import java.lang.StrictMath.random

fun main(){
    println("Pense em um número de 1 a 100 e eu vou tentar adivinhar!")
    println("============ Pressione ENTER pra INICIAR ============")
    readLine()

    var low = 1
    var high = 100

    var randomico = (1..100).random()
    var media: Int
    var resposta: String
    println("Começou o jogo")

    while(true){
        media = randomico / 2
        resposta = readln() ?: "Error"
        println("O numero é $media?")

        if(resposta == "maior") {
            println("acertei o numero é $media")
            break
        }
    }
}