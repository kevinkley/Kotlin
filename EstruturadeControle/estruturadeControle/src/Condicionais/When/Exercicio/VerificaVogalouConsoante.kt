package Condicionais.When.Exercicio

fun main(){
    isVogalouConsoante()


    val char1 = readln()
    checkCharacterType(char1.first())
}

fun isVogalouConsoante(){
    val letra = "a"

    when(letra){
        "a","b","c","d","e" -> println("Letra: \'${letra}\' é Vogal")
        else -> println("Consoante")
    }
}

//Forma mais complexa, usando as expressões regulares junto do when
fun checkCharacterType(character: Char) {
    when {
        character.toString().matches(Regex("[aeiouAEIOU]")) -> {
            println("É uma vogal")
        }
        character.toString().matches(Regex("[a-zA-Z]")) -> {
            println("É uma consoante")
        }
        else -> {
            println("É outro tipo de caractere")
        }
    }
}