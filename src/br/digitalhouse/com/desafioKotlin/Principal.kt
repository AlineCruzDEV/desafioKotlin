package br.digitalhouse.com.desafioKotlin

import java.util.*

fun main() {

    //testando parteA
    val aluno1 = Aluno("Aline", "Cruz", 1)
    val aluno2 = Aluno("Alessandra", "Luisi", 2)
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
    val curso1 = Curso("Java", 1, 5)
    val curso2 = Curso("Kotlin", 1, 4)

    verificaIgualdade = curso1.equals(curso2)
    println("\n"+verificaIgualdade)
    println()

    //testando parteF
    var data = Date()
    val matricula1 = Matricula(aluno1, curso1, data)
    val matricula2 = Matricula(aluno2, curso2, data)
    println()

    //testando parteG
    val digitalManager = DigitalHouseManager()

    //testando parteH
    val aluno3 = Aluno("Aurea", "Tolentino", 3)
    val aluno4 = Aluno("Angelo", "Luisi", 4)
    val aluno5 = Aluno("Antonio", "Abidal", 5)

    curso1.adicionarUmAluno(aluno3)
    curso1.adicionarUmAluno(aluno4)
    curso1.excluirAluno(aluno1)
    //curso1.adicionarUmAluno(aluno4)
    curso1.excluirAluno(aluno5)
    curso1.excluirAluno(aluno1)

    println("\n---Agora com digitalmanager---")
    digitalManager.listaDeAlunos.put(1, aluno1)
    digitalManager.listaDeAlunos.put(2, aluno2)

    digitalManager.listaDeCursos.put(1,curso1)
    digitalManager.matricularAluno(1,1)

}