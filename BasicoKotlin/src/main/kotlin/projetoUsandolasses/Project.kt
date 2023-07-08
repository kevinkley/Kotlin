package projetoUsandolasses

fun main(){
    val carro = Carro(2021)
    carro.sairVoado()
    carro.capoRemovivel(carro)
}

class Carro(override val modelo: Int) : Veiculo(), sobeCapo{

    fun capoRemovivel(sobeCapo: sobeCapo){
        sobeCapo.modelo
        condicaoSemCapo()
    }

    fun sairVoado(){
        aceleracao()
    }
}

interface sobeCapo{
    val modelo: Int

    fun condicaoSemCapo(){
        if(modelo > 2020){
            println("Modelo sobe o capo $modelo")
        }else{
            println("Sem subida de capo $modelo")
        }
    }
}

abstract class Veiculo(estado: String = "Novo", rodamento: Int = 0){
    private val velocidade = 200

    private val condicao = estado
    private val km = rodamento

    open protected fun aceleracao(){
        println("Condição = $condicao\nKilometragem = $km\n")

        println("A velocidade da aceleração é $velocidade")
    }
}