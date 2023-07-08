package Generics

fun main(){
    val item: String = "kevin"
    funGenerica<String>(item)
}

fun <T : Number> funGenerica(item: T){
    println("Função generica que aceita apenas INT $item")
}

fun<T : String> funGenerica(item: T){
    println("Função generica que aceita apenas String $item")
}