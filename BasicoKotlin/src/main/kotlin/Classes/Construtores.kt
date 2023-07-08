package Classes

import java.util.*

//Classe de construtor primario
class ConstructorPrimario(nome: String = "vazio", idade: Int = 0) {
    var nome: String? = nome
    var idade: Int? = idade
}

fun main(){
    val scanner = Scanner(System.`in`)
    /*val receberConstructor = ConstructorPrimario()

    receberConstructor.nome = scanner.next()
    receberConstructor.idade = scanner.nextInt()

    println("Nome: ${ receberConstructor.nome }\nIdade: ${ receberConstructor.idade }")*/

    val receberSecundario = constructorSecundario("kevin", 27)
    println("Nome: ${ receberSecundario.nome }\nIdade: ${ receberSecundario.idade }")
    println("")
    val receberSecundario2 = constructorSecundario("kevin")
    println("Nome: ${ receberSecundario2.nome }\nIdade: ${ receberSecundario2.idade }")
}

//Classe de construtor secundário
class constructorSecundario(nome: String, idade: Int) {
    val nome: String
    var idade: Int

    //Construtor secundário
    //OBS: o this é usado para referenciar a classe
    //OBS: o this é usado para referenciar o construtor primário
    constructor(nome: String) : this("vaszssio", 0){

    }

    //Bloco de inicialização
    //OBS: o init é executado antes do construtor
    //OBS: poder adiciona logica dentro do init
    init{
        this.nome = nome
        this.idade = idade

        if(nome.length < 5) {
            println("Nome muito curto")
        }
    }
}
