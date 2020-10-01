package br.digitalhouse.com.desafioKotlin

import java.util.*

fun main() {

    val digitalManager = DigitalHouseManager()

    println("\n---Bem vindo à <Digital House> School---\n")

    println("---Cadastro de Professores Titulares---")
    digitalManager.registrarProfessorTitular("Aline", "Cruz", 1, "Android")
    digitalManager.registrarProfessorTitular("Alessandra", "Luisi", 2, "Web")

    println("\n---Cadastro de Professores Adjuntos---")
    digitalManager.registrarProfessorAdjunto("Jorge", "Roberto", 3, 20)
    digitalManager.registrarProfessorAdjunto("Welisson", "Dias", 4, 10)

    println("\n---Cadastro de Cursos---")
    digitalManager.registrarCurso("Full Stack", 20001,3)
    digitalManager.registrarCurso("Android", 20002, 2)

    println("\n---Alocando os Professores nos cursos---")
    digitalManager.alocarProfessores(20001, 2, 4)
    digitalManager.alocarProfessores(20002,1,3)

    println("\n---Matricula de Alunos na Instituição---")
    digitalManager.matricularAluno("Angelo", "Luisi", 1)
    digitalManager.matricularAluno("Ronald", "Cavalho", 2)
    digitalManager.matricularAluno("Pig", "Luisi", 3)
    digitalManager.matricularAluno("Yoda", "Cruz", 4)
    digitalManager.matricularAluno("Darth", "Vader", 5)

    println("\n---Matriculando Alunos nos Cursos---")
    digitalManager.matricularAluno(1,20001)
    digitalManager.matricularAluno(2,20001)
    digitalManager.matricularAluno(3,20002)
    digitalManager.matricularAluno(4, 20002)
    digitalManager.matricularAluno(5,20002)
}