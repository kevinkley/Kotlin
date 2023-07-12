package EscopodeFuncao

fun main(){
    var contador = 0

    val incrementar = {
        contador++
    }
    val decrementar: () -> Unit = {
        contador--
    }

    println(contador)

    incrementar()
    println(contador)

    incrementar()
    println(contador)
}