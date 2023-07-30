import jdk.swing.interop.SwingInterOpUtils

fun main() {
    var condicao = true
    var valor1: Int
    var valor2: Int
    var operador: String
    var resultado: Int
    var receberResultado = 0
    do{
        var soma = 0

        println("Digite um operador:s ")
        operador = readln()

        if(operador == "+"){
            println("Digite um valor: ")
            valor1 = readln().toIntOrNull() ?: 0
            println("Digite um valor: ")
            valor2 = readln().toIntOrNull() ?: 0

            resultado = valor1.plus(valor2)
            soma += resultado
        }else{
            condicao = false
        }

        receberResultado += soma
        println("soma é $receberResultado")
    }while(condicao)
}
