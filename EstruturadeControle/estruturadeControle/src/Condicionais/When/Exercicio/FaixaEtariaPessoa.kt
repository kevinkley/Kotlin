package Condicionais.When.Exercicio

fun main(){
    val faixa = FaixaEtariaPessoa()
    faixa.faixaEtaria()
}


class FaixaEtariaPessoa{
    private var idade: Int = 19

    fun faixaEtaria() {
        when {
            idade >= 18 -> println("$idade é Maior de idade")
            else -> println("$idade é Menor de idade")
        }
    }
}