package Operadores_de_Error

fun main(){
    val texto: String? = null
    val tamanho = obterTamanho(texto)
    println(tamanho)
}

fun obterTamanho(texto: String?): Int{
    return texto!!.length
}
