package FuncaoExtensao

fun String.casa(){
    println(message = "Meu nome é $this kley e tenho ")
}

fun Int.ano(){
    println("Minha idade é $this anos")
}

fun main(){
    val name = "kevin"
    val idade = 27
    name.casa()
    idade.ano()


    externa()

    println()
}

fun externa(){
    val externaVal = "Variavel externa"

    fun interna1(){
        println("chamada da variavel externa dentro da função interna $externaVal")
    }

    fun interna2(){
        val dados = "funcao interna 2"
        println("Função interna 2")
        interna1()
    }

    interna2()
}
