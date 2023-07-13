package Condicionais.If_e_Else.Exercicio

fun main(){
    val nota = readln().toInt()

    val classificao = if(nota in 90..100) "Nota = A"
        else if (nota in 80..90) "Nota = B"
            else if(nota in 70..80) "Nota = C"
                else if(nota in 60..70) "Nota = D"
                    else if(nota in 0..60) "Nota = E"
                        else "Nota inválida"
    println(classificao)
}