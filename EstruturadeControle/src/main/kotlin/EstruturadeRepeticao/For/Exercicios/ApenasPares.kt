fun main(){
    apenaspares()
}

fun apenaspares(){
    val numeros = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println("Números pares a função (.filter{}): ")
    for(x in numeros.filter{it % 2 == 0}){
        print("$x ")
    }
    println("\n-----------------------------")
    println("Usando o if pra verificar se é par:")
    for(x in numeros){
        if(x % 2 == 0){
            print("$x ")
        }
    }
}