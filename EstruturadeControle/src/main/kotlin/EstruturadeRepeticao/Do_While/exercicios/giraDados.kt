package EstruturadeRepeticao.Do_While.exercicios

fun main(){
    var dado1: Int
    var dado2: Int
    var soma: Int

    var sair: String

    do{
        dado1 = (1..6).random()
        dado2 = (1..6).random()
        soma = dado1.plus(dado2)

        println("Dado1 = $dado1\nDado2 = $dado2")
        println("Soma = $soma")
        println("------------------")
        println("Lançar os dados novamente? (s/n)")

        sair = readLine().toString()
    }while(sair != "n")
}