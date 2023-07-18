package EstruturadeRepeticao.For.Exercicios

fun main(){
        calculaFatorial()
    println("-------------------------------")
    val numero = 5
    val resultado = fatorial(numero)
    println("O fatorial de $numero é $resultado")
}
fun fatorial(n: Int): Int { //Forma dois de se fazer o calculo
    return if (n == 0 || n == 1) {
        1
    } else {
        n * fatorial(n - 1)
    }
}

fun calculaFatorial(){
    val dados  = arrayOf(1,2,3,4,5)

    for(x in dados.size downTo 1){
        var fatorial = 1
        for(y in 1..x){
            fatorial *= y
        }
        println("Fatorial de $x é $fatorial")
    }
}
