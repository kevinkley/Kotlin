package EstruturadeRepeticao.Do_While

data class dados(val nome: String, val cpf: Int = readln().toInt(), val idade: Int)
fun main(){
    /*val cpf2 = 123

    do{
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

    doWhile()
}

fun doWhile(){
    val cpfUser = 123
    var pontos = 0

    saida@do{
        println("Digite seu cpf:")
        val cpf = readLine()?.toIntOrNull()

        if(cpf == cpfUser){
            println("Login efetuado com sucesso")
            pontos++
        }else{
            println("Login errado")
            pontos--

            println("soma dos $pontos")

            if(pontos == -2){
                println("-----------------------------")
                println("Atingiu o limite de tentativas negativas")
                break@saida
            }

            println("Tente novamente")
        }
        println("-----------------------------")
    }while(cpf != cpfUser)
}