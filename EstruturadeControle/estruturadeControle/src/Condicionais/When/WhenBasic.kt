package Condicionais.When

fun main(){
    val valor = 0

    //Sem Argumento
    //when sem argumento é como se fosse um if
    //when sem argumento pode ser usado com intervalos
    when{
        (valor > 0) and (valor < 10) -> println("Valor positivo")
        valor < 0 -> println("Valor negativo")
        else -> println("Valor neutro")
    }

    //Com Argumento
    //when com argumento é como se fosse um switch
    //O argumento pode ser qualquer tipo de dado
    //when com argumento pode ser usado com intervalos
        when(valor){
        in 0..10 -> println("Valor positivo")
        in 0 downTo  -10 -> println("Valor negativo")
        in 11..20 -> println("Valor entre 11 e 20")
        else -> println("Valor neutro")
    }
}