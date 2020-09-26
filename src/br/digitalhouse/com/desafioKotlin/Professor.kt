package br.digitalhouse.com.desafioKotlin

class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, val codigoProfessor: Int) {

    init {
        println("Professor $nome $sobrenome - Codigo $codigoProfessor cadastrado com sucesso")
    }

    //verifica se dois professores são iguais tendo base apenas seus códigos
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }
}