package EstruturadeRepeticao.For.Exercicios

fun main(){
    val number = 2
    if(isPrime(number)){
        println("$number é primo")
    }else{
        println("$number não é primo")
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}