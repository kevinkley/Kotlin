package Classes

fun main(){
    val dog = Cachorro()
    dog.latir()

    val cat = Gato()
    cat.miar()
}

abstract class Animal(val nome: String){
    fun som(){
        println("Som do animal")
    }
}

class Cachorro : Animal("Cachorro"){
    fun latir(){
        println("Au au")
    }


}

class Gato : Animal("Gato"){
    fun miar(){
        println("Miau")
    }
}
