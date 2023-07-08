package ClasseModificadoresAcesso


fun main(){
    val instanciarInternal = ClassInternal()
    instanciarInternal.funInternal()
}

internal class ClassInternal{
    val poder: Float = 104f

    internal fun funInternal(){
        println("Poder de $poder")
    }
}