package br.digitalhouse.com.desafioKotlin

import java.util.*

fun main() {

    //testando parteA
    val aluno1 = Aluno("Aline", "Cruz", 1)
    val aluno2 = Aluno("Alessandra", "Luisi", 1)
    var verificaIgualdade: Boolean

    verificaIgualdade = aluno1.equals(aluno2)
    println(verificaIgualdade)
    println()

    //testando parteD
    val professor1 = ProfessorTitular("Aline", "Cruz", 2, 1, "Android")
    val professor2 = ProfessorAdjunto("Alessandra", "Luisi", 20, 1, 4)

    verificaIgualdade = professor1.equals(professor2)
    println(verificaIgualdade)

    //testando parteE
    val curso1 = Curso("Java", 1, professor1, professor2,4, mutableListOf(aluno1,aluno2))
    val curso2 = Curso("Kotlin", 1, professor1, professor2,4, mutableListOf(aluno2,aluno1))

    verificaIgualdade = curso1.equals(curso2)
    println("\n"+verificaIgualdade)
    println()

    //testando parteF
    var data = Date()
    val matricula1 = Matricula(aluno1, curso1, data)
    val matricula2 = Matricula(aluno2, curso2, data)
    println()

    //testando parteG
    val digitalManager = DigitalHouseManager(mutableListOf(aluno1, aluno2), mutableListOf(professor1, professor2), mutableListOf(curso1, curso2), mutableListOf(matricula1, matricula2))
}