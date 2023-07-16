package Condicionais.When

fun main(){
    checkTypes(2)
}

fun checkType(obj: Any) {
    when (obj) {
        is String -> {
            if(obj.length > 5) println("É uma String com mais de 5 caracteres")
            else println("É uma String com menos de 5 caracteres")
        }
        is Int -> println("É um Int")
        is Boolean -> println("É um Boolean")
        else -> println("Tipo desconhecido")
    }
}

fun checkTypes(obj: Any){
    when{
        obj is String && obj.isNotEmpty() -> println("É uma String não vazia")
        obj is Int && obj.minus(2) in 1..10 -> println("É um número inteiro entre 1 e 10")
        else -> println("Tipo desconhecido")
    }
}

