package EstruturadeRepeticao.Do_While

data class dados(val nome: String, val cpf: Int = readln().toInt(), val idade: Int)
fun main(){
    /*val cpf2 = 123

    do{
        val dado = dados("kevin", 123, 18)
        dado.nome

        "Digite seu nome, cpf e idade:"
        val nome = "kevin"
        val cpf = readln().toInt()
        val idade = 18

        println("Nome: $nome\nCpf: $cpf\nIdade: $idade")

        if(cpf.equals(cpf2)){
            println("Login efetuado com sucesso")
        }else{
            println("Login errado")
        }
            println("-----------------------------")
    }while(cpf != cpf2)*/


    println("Digite seu nome:")
    val nome = readln().lowercase()
    receber(nome)
}


fun receber(nome: String) = when(nome){
    "kevin" -> println("Nome: $nome")
    "ana" -> println("Nome: $nome")
    else -> {
        println("Error")}
}