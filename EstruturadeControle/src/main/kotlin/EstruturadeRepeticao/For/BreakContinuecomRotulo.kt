package EstruturadeRepeticao.For

fun main(){
    //breakeContinuecomRotulo()

    val matriz = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    loopExterno@ for (linha in matriz) {
        loopInterno@for (elemento in linha) {
            if (elemento == 3) {
                break@loopExterno
            }
            println(elemento)
        }
        println("dados da matriz")
    }

}

fun breakeContinuecomRotulo(){
    val lista1 = arrayOf("Kevin", "Maria", "João", "Pedro", "Ana")
    val lista2 = arrayOf("bolo", "pudim", "sorvete", "brigadeiro", "chocolate")
    val listanum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    externo@ for (i in lista1) {
       interno@ for (j in lista2) {

        }
    }
}