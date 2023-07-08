package Classes

import java.util.*


fun main(){
    val scanner = Scanner(System.`in`)

    val especie = Terra()
    especie.habilidade(scanner.nextLine())
    especie.cor(scanner.nextLine())
}

class Terra : Alien(){
    override fun habilidade(habilidade: String){
        println("Habilidade: $habilidade")
    }
}

abstract class Alien{
    abstract fun habilidade(habilidade: String)

    open fun cor(cor: String){
        println("Cor: $cor")
    }
}