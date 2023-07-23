package EstruturadeRepeticao.Do_While.exercicios

fun main(){
    /*val numeroaleatorio = (0..100).random()*/
    val numeroaleatorio2 = 33
    var tentativas = 0
    try{
        do{
            println("Acerte o numero entre 1 e 100")
            val numero = readln().toInt()
            val dicaMaior = "É Maior"
            val dicaMenor = "É Menor"

            when(numero){
                in 1..32 -> println(dicaMaior)
                33 -> println("Parabens, voce acertou o numero")
                in 34..100 -> println(dicaMenor)
                else -> break
            }
            tentativas++
        }while(numeroaleatorio2 != numero && numero < 100)
        println("Acertou em $tentativas Tentativas")

    }catch(e: Exception){
        println("Digite um numero valido")
    }
}