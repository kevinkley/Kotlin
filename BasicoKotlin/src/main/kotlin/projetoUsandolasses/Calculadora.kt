package projetoUsandolasses
import java.util.Scanner

fun main(){
    val calculadora = Calculadora()
    println("Calculadora")

    // USANDO O SCANNER PARA ENTRADA DE DADOS
        /*val resultSoma = calculadora.soma()
        val resultSubtracao = calculadora.sub(9.2, 2.1)
        val resultMultiplicacao = calculadora.mult(9.2, 2.1)
        val resultDivisao = calculadora.div(9.0, 2.0)
        println("Soma = $resultSoma\nSubtraçao = $resultSubtracao\nMultiplicação = $resultMultiplicacao\nDivisão = $resultDivisao")*/

    //USANDO O READLINE PARA ENTRADA DE DADOS
    println("Digite o primeiro numero: ")
    val resultado = calculadora.soma()
    println("Soma = $resultado")
}

class Calculadora{
    /*private val scanner = Scanner(System.`in`)*/

    //readlnOrNull() retorna null se o usuario digitar algo que nao seja um numero
    //toDoubleOrNull() retorna null se o usuario digitar algo que nao seja um numero
    //let{} executa o bloco de codigo se a variavel nao for nula
    //?: operador elvis, se a variavel for nula, retorna o valor depois do operador
    //funcao soma com parametros opcionais
    //funcao soma com parametros opcionais e com valores padrao
    fun soma(num: Double? = readLine()?.toDoubleOrNull(), num2: Double? = readLine()?.toDoubleOrNull()): Double{
        return num2?.plus(num!!) ?: 0.0
    }

    fun sub(num: Double, num2: Double): Double{
        return num.minus(num2)
    }

    fun mult(num: Double, num2: Double): Double{
        return num * num2
    }

    fun div(num: Double, num2: Double): Double{
        if (num2 != 0.0) {
            return num / num2
        } else {
            throw IllegalArgumentException("Cannot divide by zero")
        }
    }
}


