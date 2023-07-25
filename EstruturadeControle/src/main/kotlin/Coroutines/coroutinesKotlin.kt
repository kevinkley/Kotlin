package Coroutines
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch {
            delay(5000) // Simulando uma operação assíncrona que leva 1 segundo
            println("Corroutine 1: Terminou!")

            launch {
                delay(10000) // Simulando outra operação assíncrona que leva 2 segundos
                println("Corroutine 2: Terminou!")
            }
        }
        println("Fim do programa!")
    }
}