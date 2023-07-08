package Classes

import java.util.Scanner

val scanner = Scanner(System.`in`)
var nome: String = scanner.next()

fun main(){
    val endereco = Address()

    val endResultado = copyAddress(endereco)
    println("Nome: ${ endResultado.name }")
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip
    return result
}

class Address{
    var name: String = nome
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}
