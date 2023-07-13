package Condicionais.If_e_Else.Exercicio

fun main(){
    val numero = readln().toInt()

    val retorno = if(numero in 1..100) "Intervalo entre 1 e 100, numero ${numero}" else "Fora do intervalo, numero ${numero}"
    println(retorno)
}