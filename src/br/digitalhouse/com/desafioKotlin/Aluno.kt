package br.digitalhouse.com.desafioKotlin

class Aluno(
        var nome: String,
        var sobrenome: String,
        val codigoAluno: Int
) {

    init {
        println("<Digital House> Aluno(a) $nome $sobrenome - Codigo $codigoAluno criado(a) no sistema.")
    }

    //verifica se dois alunos são iguais tendo base apenas seus códigos
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigoAluno != other.codigoAluno) return false

        return true
    }
}