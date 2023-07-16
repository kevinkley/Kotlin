package EstruturadeRepeticao.For.Exercicios

fun main(){
    ordemCrescente()
}

fun ordemCrescente(){
    val numeros = arrayOf(3,8,2,1,9,4)

    for(x in numeros.sorted()){
        print("$x ")
    }
    println("\n-------------------------------------------------")
val lista = listOf(6,2,3,5,8)
    val listaOrdenada = lista.sorted()
    println(listaOrdenada) // Saída: [1, 2, 3, 5, 8]
}