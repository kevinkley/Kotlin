package Classes

fun main(){
    var mostrarInterface = receberInterface()
    mostrarInterface.aniversario()
    println("Idade = ${mostrarInterface.idade} , Altura = ${mostrarInterface.altura} , Cor = ${mostrarInterface.cor}")
}

class receberInterface : Humano, Cor{
    override var idade = 27
    override var altura = 1.81f
    override var cor = "Branco"

    override fun aniversario() {
        super.aniversario()
    }
}

interface Humano{
    var idade: Int
    var altura: Float

    fun aniversario(){
        println("Feliz Aniversário")
    }
}

interface Cor{
    var cor: String

    fun musculo(){
        println("Grande")
    }
}
