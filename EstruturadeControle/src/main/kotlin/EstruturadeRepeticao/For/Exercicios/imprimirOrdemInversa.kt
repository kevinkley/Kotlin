package EstruturadeRepeticao.For.Exercicios

fun main(){
    imprimirOrdemInversa()
}

fun imprimirOrdemInversa(){
    val lista = arrayOf("Pato", "Cachorro", "Gato", "Galinha", "Vaca")

    
    for(x in lista.reversed()){
        println(x)
    }
}