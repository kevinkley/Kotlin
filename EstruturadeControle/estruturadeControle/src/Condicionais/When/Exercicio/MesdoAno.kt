package Condicionais.When.Exercicio

fun main(){
    val mesEscolhido = 1
    println(mesdoAno(mesEscolhido))
}

fun mesdoAno(mes: Int): String{
    val meses = arrayOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro")

    return when(mes){
        in 1..12 -> meses[mes - 1]
        else -> "Mês inválido"
    }
}
