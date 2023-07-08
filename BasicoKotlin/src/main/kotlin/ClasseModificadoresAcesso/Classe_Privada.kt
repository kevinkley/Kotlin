package ClasseModificadoresAcesso

fun main(){
    val classePrivada = Classe_Privada()
    classePrivada.receberFunPrivada()
}

class Classe_Privada{
    private val nome: String = "kevin"

    private fun mostrarNome(){
        println("My name is $nome")
    }

    fun receberFunPrivada(){
        mostrarNome()
    }
}