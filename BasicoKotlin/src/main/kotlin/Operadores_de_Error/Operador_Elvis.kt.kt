package Operadores_de_Error

fun main(){
    val texto = readLine()
    val tamanho = operadorElvis(texto)
    println("O tamanho é $tamanho")

}

fun operadorElvis(texto: String?): Number{
    return texto?.length ?: 0
}