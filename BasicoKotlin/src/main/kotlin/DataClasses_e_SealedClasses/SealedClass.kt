package DataClasses_e_SealedClasses

fun main(){
    processResult(Success("Successs"))
}

fun processResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Error -> println("Error: ${result.exception}")
    }
}

sealed class Result
data class Success(val data: Any) : Result()
data class Error(val exception: Exception) : Result()