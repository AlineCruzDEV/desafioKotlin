package br.digitalhouse.com.desafioKotlin

fun main() {
    val aluno1 = Aluno("Aline", "Cruz", 1)
    val aluno2 = Aluno("Alessandra", "Luisi", 1)
    var verificaIgualdade: Boolean

    verificaIgualdade = aluno1.equals(aluno2)

    println(verificaIgualdade)

}