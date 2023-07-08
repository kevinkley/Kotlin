package `ClasseNestead(Aninhada)`

fun main(){
    val classeExterna = ClasseOuter()

    val inner = classeExterna.InnerClass()
        inner.mostrar()
        inner.mostrar2()

    val estatica = ClasseOuter.ClassEstatica()
    estatica.funEstatica()
}

class ClasseOuter {
    val nome = "Classe Outer"

    // É uma classe dentro de outra classe
    // A inner class tem acesso a classe externa
    // A inner class não pode ser instanciada sem a classe externa
    // A inner class pode acessar os membros da classe externa
    // A inner class pode ser privada
    // A inner class pode ser herdada
    // A inner class pode ser estática
    // A inner class pode ser anônima
    // A inner class pode ser local
    // A inner class pode ser aninhada
    inner class InnerClass{
        fun mostrar(){
            println("Inner Class ${this@ClasseOuter.nome}")
        }
        fun mostrar2(){
            println("Inner Class ${this@ClasseOuter.nome}")
        }
    }

    class ClassEstatica{
        fun funEstatica(){
            println("Inner Class Estátisca")
        }
    }
}