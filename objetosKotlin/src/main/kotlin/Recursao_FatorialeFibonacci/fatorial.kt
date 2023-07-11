package Recursao_FatorialeFibonacci

fun main(){
    println(fatorial(5))
    println(fatirol(3))
}

fun fatorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * fatorial(n - 1)
    }
}

fun fatirol(nn: Int): Int{
    if (nn == 0 || nn == 1){
        return 1
    }
    return nn * fatirol(nn -1)
}