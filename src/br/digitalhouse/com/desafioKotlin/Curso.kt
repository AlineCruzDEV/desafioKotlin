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
        listaAlunos.forEach { print("\t" + it.nome + ",") }
    }

    //verifica se dois cursos são iguais tendo base apenas seus códigos
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    //funcao para adicionar um aluno à lista de alunos do curso. Retorna true se possível ou false caso nao tenha vagas
    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return when {
            listaAlunos.size < qtdadeMaximaAlunos -> {
                println("Tamanho da Lista ${listaAlunos.size} - Quantidade maxima $qtdadeMaximaAlunos")
                listaAlunos.add(umAluno)
                println("Aluno ${umAluno.nome} adicionado ao curso $nome. Lista atual:")
                listaAlunos.forEach { println(it.nome) }
                true
            }
            else -> {
                println("Tamanho da Lista ${listaAlunos.size} - Quantidade maxima $qtdadeMaximaAlunos")
                println("Nao há vagas disponíveis no curso $nome. Não foi possível adicionar aluno ${umAluno.nome}")
                false
            }
        }
    }

    //funcao que exclui aluno da lista de alunos do curso
    fun excluirAluno(umAluno: Aluno) {
        when {
            listaAlunos.contains(umAluno) -> {
                listaAlunos.remove(umAluno)
                println("Aluno ${umAluno.nome} removido com sucesso do curso $nome. Lista atual:")
                listaAlunos.forEach { println(it.nome) }
            }
            else -> println("Aluno ${umAluno.nome} não pertence a esse curso")
        }
    }
}