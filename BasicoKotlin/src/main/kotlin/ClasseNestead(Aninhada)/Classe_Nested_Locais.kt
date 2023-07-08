package `ClasseNestead(Aninhada)`

fun main(){
    funPrincipal()
}

fun funPrincipal(){
    val message = "Função que receber a classe local"

    // É uma classe dentro de uma função
    // A classe local tem acesso a função externa
    class ClasseLocal{
        fun printMessage(){
            println(message)
        }
    }

    val local = ClasseLocal()
    local.printMessage()
}

class ab{
    companion object{
        fun funcaoEstatica(){
            println("Função Estática")
        }
    }
}