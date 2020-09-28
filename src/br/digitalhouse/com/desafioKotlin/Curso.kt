package br.digitalhouse.com.desafioKotlin

class Curso(
        var nome: String,
        val codigoCurso: Int,
        var professorTitular: ProfessorTitular,
        var professorAdjunto: ProfessorAdjunto,
        var qtdadeMaximaAlunos: Int,
        var listaAlunos: MutableList<Aluno>
) {

    init {
        println("\nCurso $nome - Codigo $codigoCurso criado com sucesso. \nMembros: Professor Titular ${professorTitular.nome}, Professor Adjunto ${professorAdjunto.nome}, Máximo de $qtdadeMaximaAlunos alunos")
        println("Lista de Alunos Matriculados: ")
        listaAlunos.forEach { print("\t" + it.nome + ",")}
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