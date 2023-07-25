package EstruturadeRepeticao.Do_While.exercicios

fun main(){
//Escreva um programa que solicita ao usuário que digite várias notas (números decimais)
// e calcule a média dessas notas usando o do-while. O programa deve continuar pedindo novas notas até que o
// usuário digite um valor negativo, momento em que o cálculo da média deve ser exibido.

    var totalNotas = 0
    var nota: Double
    var somaNotas = 0.0

    println("Digite ENTER pra inicia")
    readLine()
    println("Para sair digite um número negativo")
    println("Digite uma nota:")

    do{
        nota = readLine()?.toDoubleOrNull() ?: 0.0

        if(nota >= 0){
            totalNotas++
            somaNotas += nota
        }
    }while(nota >= 0)

    if(somaNotas >= 0){
        val media = somaNotas / totalNotas
        println("Sua média é $media")
    }else{
        println("Não foi digitado nenhuma nota")
    }
}