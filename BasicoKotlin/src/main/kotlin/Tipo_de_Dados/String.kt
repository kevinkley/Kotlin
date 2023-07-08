package Tipo_de_Dados

import java.util.*

fun main(){
    val a = 10f
    val b = 20f

    println("Soma = " + a.plus(b))
    println("subtrair = " + a.minus(b))
    println("multiplica = " + a.times(b))
    println("dividir = " + a.div(b))
    println("resto = " + a.rem(b))
    println("entre = " + a.rangeTo(b))

    val dados = if(a > b) "maior" else "menor"

    println("dados = " + dados)

    val dado = when{
        a == b -> "igual"
        a > b -> "maior"
        else -> "menor"
    }
    println(dado)

    val nomes: String? = "null"
    val nomeNaoNulo: String = nomes!! // Afirmando que nome não é nulo

    println(nomeNaoNulo.length) // Não será feita a verificação de nulidade, pois nomeNaoNulo é considerado não nulo

    val ai = retornaComValor_e_Variavel(99)
    println(ai)

    val returnDireto = retornaComValor_mas_sem_Variavel(100)
    println(returnDireto)

    val dentroDaAtribuicaodoTipo = retornaNaPropriaAtribuição(12)
    println(dentroDaAtribuicaodoTipo)

    val funcaoAnonima: (Int) -> String = {
        b -> b.toString()
    }
    println(funcaoAnonima(10))

    val numeros = 1..10
    val sorteio = numeros.shuffled()
    println("Sorteado ${sorteio}")

    var email = "kevinkleyoficial@gmail.com"
    val emailValido = email.contains("@")

    fun functionAnonima(anonimato: () -> Unit){
        Thread.sleep(1000)
        anonimato()
    }
    functionAnonima{
        println("anonimato")
    }
    fun naoNulo(nomes: Int): String{
        val nome: String? = "kevins".plus(" kley")
        val nomei = if(nome != null) println(nome.toUpperCase()) else println("nome vazio")
        return nomei.toString()
    }


}



fun retornaComValor_e_Variavel(num: Int): String {
    val valor = if (10 > num) "Maior" else "Menor"
    return valor
}

fun retornaComValor_mas_sem_Variavel(num: Int): String {
    return if(10 > num) "Maior declarado dentro do return" else "Menor declarado dentro do return"
}

fun retornaNaPropriaAtribuição(nume: Int): String = if(2 > 9) "MAIOR dentro da atribuição" else "Menor dentro da atribuição"
