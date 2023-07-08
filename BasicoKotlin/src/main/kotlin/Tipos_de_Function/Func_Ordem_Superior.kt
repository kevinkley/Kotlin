package Tipos_de_Function

import java.util.*
import java.util.Objects.toString

fun main(){
    val scanner = Scanner(System.`in`)
    //Adiciona o nome e sobrenome de forma dinamica e passa tudo pra maiusculo
    //OBS: o uppercase(Locale.getDefault()) é o novo padrão permitido já que o outra da descontinuado, parece.
    val addNome: String = scanner.next().uppercase(Locale.getDefault())
    val addSobrenome: String = scanner.next().uppercase(Locale.getDefault())

    //Aqui é a função de ordem superior, que recebe o nome e sobrenome e retorna o nome completo
    //OBS: o plus é o mesmo que o +, porém, o plus é mais recomendado
    //OBS: o toString() é o mesmo que o .toString(), porém, o toString() é mais recomendado
    //OBS: o ${} é o mesmo que o +, porém, o ${} é mais recomendado
    //OBS: o .plus() é o mesmo que o +, porém, o .plus() é mais recomendado
    //OBS: o .toString() é o mesmo que o +, porém, o .toString() é mais recomendado
    val receber = functionOrdemSuperior(addNome, addSobrenome) {
        nome -> toString(nome)
    }
    println(receber)
}

//Aqui é a função de ordem superior, que recebe o nome e sobrenome e retorna o nome completo
fun functionOrdemSuperior(nome: String?, sobrenome: String, completo: (String) -> String): String{
    return completo(nome.plus("" + sobrenome))
}