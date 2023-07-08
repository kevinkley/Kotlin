package Operadores_de_Error

fun main(){
    val endereco: Endereco? = 2.let {
        Endereco("Rua dos Bobos", 414)
    }
    val rua = obterRua(endereco)
    println(rua)
}
data class Endereco(val rua: String, val numero: Int)

fun obterRua(endereco: Endereco?): String? {
    return "Endereço: ${endereco?.rua}\nRua: ${endereco?.numero}"
}
