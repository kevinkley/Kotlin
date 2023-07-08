package ClasseModificadoresAcesso

fun main(){
 val instanciar = receber_a_Protegida()
    instanciar.receberFun()
}

open class Classe_Protegida{
    protected val nome: String = "kevin"
    protected  val idade: Int = 27

    protected fun mostrarNome(){
        println(nome)
    }
}

class receber_a_Protegida : Classe_Protegida(){
    fun receberFun(){
        mostrarNome()
        println("My name is $nome e tengo $idade anos" )
    }
}