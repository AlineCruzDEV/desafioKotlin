package br.digitalhouse.com.desafioKotlin

import java.util.*

class Matricula(
        var aluno: Aluno,
        var curso: Curso,
        val data: Date
) {

    init {
        println("<Digital House> Aluno ${aluno.nome} matriculado no curso [${curso.nome}] na data $data")
    }
}