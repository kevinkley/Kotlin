package EstruturadeRepeticao.Do_While.exercicios

fun main(){
    var saldo = 0.0
    var escolha: Int
    var deposita: Double
    var saque: Double
    var sair: String

    do {
        saque = 0.0

        println("Escolha uma opção:")
        println("1 - Saldo")
        println("2 - Depositar")
        println("3 - Sacar")
        println("------------------")
        escolha = readLine()?.toIntOrNull() ?: 0

        /*println("Você escolheu a opção $escolha")
        if (escolha == 1) {
            println("Seu saldo é $saldo")
        } else if (escolha == 2) {

        } else if (escolha == 3) {

        } else {
            println("Opção inválida")
        }*/

        when(escolha){
            1 -> println("Seu saldo é $saldo")
            2 -> {
                println("Digite o valor a ser depositado")
                deposita = readLine()?.toDoubleOrNull() ?: 0.0
                saldo += deposita
                println("Seu saldo é $saldo")
            }
            3 -> {
                if(saldo > 0) {
                    println("Digite o valor a ser sacado")
                    saque = readLine()?.toDoubleOrNull() ?: 0.0
                    saldo -= saque
                    println("Seu saldo é $saldo")
                }else if(saque > saldo){
                    println("Seu saldo é $saldo")
                    println("Você não tem saldo para sacar")
                }else{
                    println("Seu saldo é $saldo")
                    println("Você não tem saldo para sacar")
                }
            }
            else -> println("Opção inválida")
        }

        println("------------------")
        println("Continuar? (digite 'sair' para sair)")
        sair = readLine() ?: "Error"
    } while (sair != "sair")

    println("Obrigado por usar nosso sistema")
}