package Condicionais.When.Exercicio

fun main(){
    diaDaSemanaForma1()
    diaDaSemanaForma2()
}

//Dia da semana
fun diaDaSemanaForma1(){
    val numero = 3

    when(numero){
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        8 -> println("Domingo")
        else -> println("Não é um dia da semana")
    }
}

fun diaDaSemanaForma2(){
    val numero = 7

    val retorno = when{
        numero == 2 -> "Segunda-feira"
        numero == 3 -> "Terça-feira"
        numero == 4 -> "Quarta-feira"
        numero == 5 -> "Quinta-feira"
        numero == 6 -> "Sexta-feira"
        numero == 7 -> "Sábado"
        numero == 8 -> "Domingo"
        else -> "Não é um dia da semana"
    }
    println(retorno)
}