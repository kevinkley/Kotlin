package Condicionais

val nota = 22

fun main(){
    val conceito = if(nota <= 10) "Ótimo"
    else if(nota <= 20) { "Bom" }
    else if (nota >= 30) "Regular"
    else "Péssimo"
    println(conceito)

    operadorLogico()
}

//operador logico
fun operadorLogico(){
    val idade = 19
    val sexo = "masculino"

    if((idade > 18) && (sexo == "feminino")){
        println("Você é uma mulher adulta ${idade} anos de idade e do sexo ${sexo}")
    }else{
        println("Você não é uma mulher adulta")
    }
}