
fun main() {
    var condicao = true

    while(condicao){
        println("Digite um numero: ")
        val entrada = readLine()?.toIntOrNull()

        if(entrada != null) {
            println("O nome digitado foi: $entrada")
        }else{
            condicao = false
        }
    }
}
