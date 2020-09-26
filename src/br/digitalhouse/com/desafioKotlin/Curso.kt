package br.digitalhouse.com.desafioKotlin

class Curso(var nome: String, var codigoCurso: Int) {

    init {
        println("Curso $nome - Codigo $codigoCurso criado com sucesso")
    }

    //verifica se dois cursos são iguais tendo base apenas seus códigos
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }
}