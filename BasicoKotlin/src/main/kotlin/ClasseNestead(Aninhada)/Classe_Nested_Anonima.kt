package `ClasseNestead(Aninhada)`

fun main(){
    val obj = object : InterfaceAnonima {
        override fun funcaoAnonima(){
            println("Função Anônima")
        }
    }
    obj.funcaoAnonima()
}

interface InterfaceAnonima{
    fun funcaoAnonima()
}