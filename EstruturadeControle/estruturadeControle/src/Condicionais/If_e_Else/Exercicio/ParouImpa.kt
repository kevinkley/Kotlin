package Condicionais.If_e_Else.Exercicio

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numero = scanner.nextInt()

    if(numero % 2 == 0){
        println("Par ${numero}")
    }else{
        println("Impar ${numero}")
    }
}