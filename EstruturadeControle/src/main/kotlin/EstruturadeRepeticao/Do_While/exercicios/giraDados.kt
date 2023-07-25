package EstruturadeRepeticao.Do_While.exercicios

fun main(){
    val dado1 = 1..6
    val dado2 = 1..6
    var soma: Int

    var sair: String

    do{
        val LancaDado1 = dado1.random()
        val LancaDado2 = dado2.random()

        soma = LancaDado1.plus(LancaDado2)

        println("Dado1 = $LancaDado1\nDado2 = $LancaDado2")
        println("Soma = $soma")
        println("------------------")
        println("Lançar os dados novamente? (s/n)")

        sair = readLine().toString()
    }while(sair != "n")
}

    /*val dado1 = 1..6 // Representa as faces do primeiro dado (números de 1 a 6)
    val dado2 = 1..6 // Representa as faces do segundo dado (números de 1 a 6)

    var continuar = true

    while (continuar) {
        val lancamentoDado1 = dado1.random()
        val lancamentoDado2 = dado2.random()

        println("Lançamento do dado 1: $lancamentoDado1")
        println("Lançamento do dado 2: $lancamentoDado2")

        val soma = lancamentoDado1 + lancamentoDado2
        println("Soma dos valores dos dados: $soma")

        println("Deseja lançar os dados novamente? (s/n)")
        val resposta = readLine()?.toLowerCase()

        continuar = (resposta == "s")
    }

    println("Fim do jogo!")*/
