package DataClasses_e_SealedClasses

fun main(){
    val a = DataClass("kevin", 27)
    a.nome = "kevin"
    println(a.nome.equals("kevin"))
}

// 1. Precisa ter pelo menos um parametro
// 2. Todos os parametros precisam ser "val" ou "var"
// 3. Data class nao pode ser "abstract", "open", "sealed" ou "inner"
// 4. Data class pode implementar interfaces
// 5. Data class pode herdar de outra classe
// 6. Data class pode ter funcoes
// 7. Data class pode ter propriedades
// 8. Data class pode ter construtores
// 9. Data class pode ter init blocks
// 10. Data class pode ter membros inner
// 11. Data class pode ter membros private
// 12. Data class pode ter membros sealed
// 13. Data class pode ter membros abstract
// 14. Data class pode ter membros override
// 15. Data class pode ter membros companion
// 16. Data class pode ter membros extension
// 17. Data class pode ter membros data
// 18. Data class pode ter membros final
// 19. Data class pode ter membros lateinit
// 20. Data class pode ter membros const
data class DataClass(var nome: String, var idade: Int)