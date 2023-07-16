package Condicionais.If_e_Else.Exercicio

fun main(){
    val idade = readln().toInt()
    val requisito = 18

    if(idade >= requisito){
        println("Você é maior de idade")}
    else{
        println("Você é menor de idade ${idade} anos")
    }
}