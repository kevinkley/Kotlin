package Condicionais.If_e_Else.Exercicio

fun main(){
    val numero1 = readln().toInt()
    val numero2 = readln().toInt()

    if(numero1 > numero2){
        println("O numero ${numero1} é maior que o numero ${numero2}")
    }else{
        println("O numero ${numero2} é maior que o numero ${numero1}")
    }
}