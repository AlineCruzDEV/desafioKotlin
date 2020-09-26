package br.digitalhouse.com.desafioKotlin

class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codigoProfessor: Int,
        var qtdadeHorasMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor)