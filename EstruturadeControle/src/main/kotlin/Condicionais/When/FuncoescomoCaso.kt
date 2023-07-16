package Condicionais.When

fun main(){
    maioridade()

    val valor = ValorComArgumento()
    valor.checkNumber(-3)

    val valorsem = ValorSemArgumento()
    valorsem.checkNumber(6)
}

fun validaIdade(idade: Int): Boolean {
    return idade >= 18
}

fun maioridade(){
    val idade = 20

    when (idade) {
        in 1..17 -> println("Menor de idade")
        else -> {
            if (validaIdade(idade)) {
                println("Maior de idade")
            } else {
                println("Idade inválida")
            }
        }
    }
}

//Declarado função como valor de um when com argumento na função
class ValorComArgumento{
    fun isPositive(number: Int) = number > 0
    fun isZero(number: Int) = number == 0
    fun isNegative(number: Int) = number < 0

    fun checkNumber(number: Int) {
        when(number){
            in 1..10 -> println("O número está entre 1 e 10")
            0 -> println("O número é zero")
            in -10..0 -> println("O número é negativo")
            else -> println("O número é inválido")
        }
    }
}

//Declarado função como valor de um when sem argumento na função
class ValorSemArgumento{
    fun isPositive(number: Int) = number > 0
    fun isZero(number: Int) = number == 0
    fun isNegative(number: Int) = number < 0

    fun checkNumber(number: Int) {
        when{
            isPositive(number) ->
                if(number in 0..10){
                    println("O número é positivo e está entre 0 e 10")
                }else{
                    println("O número é positivo e está acima de 10")
                }
            isZero(number) -> println("O número é zero")
            isNegative(number) -> println("O número é negativo")
            else -> println("O número é inválido")
        }
    }
}