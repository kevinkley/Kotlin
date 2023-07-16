package Condicionais.When

fun main(args: Array<String>){
    encontraCorrespondencia()
    padraoCompleto()
    substituirTechos()
}

fun encontraCorrespondencia(){
    val texto = "Olá, meu número de telefone é (123) 456-7890"
    val padrao = Regex("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")
    val correspondencia = padrao.find(texto)
    println(correspondencia?.value) // "(123) 456-7890"
}

fun padraoCompleto(){
    val texto = "12345"
    val padrao = Regex("\\d{5}")
    val correspondeCompleto = padrao.matchEntire(texto)
    println(correspondeCompleto != null) // true
}

fun substituirTechos(){
    val texto = "Olá, meu nome é João"
    val padrao = Regex("João")
    val novoTexto = padrao.replace(texto, "Maria")
    println(novoTexto) // "Olá, meu nome é Maria"
}