package EstruturadeRepeticao.Do_While.exercicios

fun main(){
    var contado = readln().toInt()

    do{
        print("$contado ")
        contado--
    }while (contado >= 0)
}