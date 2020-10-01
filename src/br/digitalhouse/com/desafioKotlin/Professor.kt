package br.digitalhouse.com.desafioKotlin

abstract class Professor(
        var nome: String,
        var sobrenome: String,
        var tempoDeCasa: Int,
        var codigoProfessor: Int
) {

    init {
        println("<Digital House> Professor $nome $sobrenome - Codigo $codigoProfessor cadastrado com sucesso.")
    }

    //verifica se dois professores são iguais tendo base apenas seus códigos
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false

        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }
}