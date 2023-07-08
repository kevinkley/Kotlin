package Classes

fun main(){
    val pai = Pai()
    pai.idade(35)
    println()
    val filho = FilhoPolimorfismo()
    filho.idade(12)
}

open class Pai{
    open fun idade(idade: Int){
        println("Pai = $idade anos")
    }
}
//OBS: A palavra reservada open é necessária para que a classe possa ser herdada
//OBS: A palavra reservada open é necessária para que o método possa ser sobrescrito
//OBS: A palavra reservada override é necessária para que o método possa ser sobrescrito
class FilhoPolimorfismo() : Pai(){
    override fun idade(idade: Int){
        println("Filho = $idade anos")
    }
}