package Generics

fun main(){
    val box: Generico<String> = Generico()
    box.funGenerica("kevin")
    box.funGenerica(8)
}

// 1. Generics é uma forma de reutilizar codigo
// 2. Generics é uma forma de escrever codigo generico
// 3. Generics é uma forma de escrever codigo que pode ser reutilizado em varios tipos
// 4. Generics é uma forma de escrever codigo que pode ser reutilizado em varios tipos de classes
// 5. Generics é uma forma de escrever codigo que pode ser reutilizado em varios tipos de classes e funcoes
// 6. Generics é uma forma de escrever codigo que pode ser reutilizado em varios tipos de classes e funcoes e interfaces
class Generico<String>{
    fun <T : Int> funGenerica(item: T){
        println("Função generica que aceita apenas INT $item")
    }

    fun<T : String> funGenerica(item: T){
        println("Função generica que aceita apenas String $item")
    }
}