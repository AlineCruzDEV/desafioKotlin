package br.digitalhouse.com.desafioKotlin

import java.util.*

class DigitalHouseManager {
    var listaDeAlunos = mutableMapOf<Int, Aluno>()
    var listaDeProfessores = mutableMapOf<Int, Professor>()
    var listaDeCursos = mutableMapOf<Int, Curso>()
    var listaDeMatriculas = mutableListOf<Matricula>()

    //registra um curso e coloca na listaDeCursos
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) = listaDeCursos.put(codigoCurso, Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))

    //exclui um curso pelo seu código
    fun excluirCurso(codigoCurso: Int) {
        when {
            listaDeCursos.containsKey(codigoCurso) -> {
                listaDeCursos.remove(codigoCurso)
                println("Curso excluído com sucesso")
            }
            else -> println("Curso não existe.")
        }
    }

    //registrar professor adjunto
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) = listaDeProfessores.put(codigoProfessor, ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras))

    //registrar professor titular
    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) = listaDeProfessores.put(codigoProfessor, ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))

    //excluir professor
    fun excluirProfessor(codigoProfessor: Int) {
        when {
            listaDeProfessores.containsKey(codigoProfessor) -> {
                listaDeProfessores.remove(codigoProfessor)
                println("Professor excluido com sucesso")
            }
            else -> println("Professor não existe")
        }
    }

    //registrar um aluno
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) = listaDeAlunos.put(codigoAluno, Aluno(nome, sobrenome, codigoAluno))

    //matricular um aluno em um curso
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var alunoAux: Aluno
        var cursoAux: Curso

        when {
            listaDeCursos.containsKey(codigoCurso) && listaDeAlunos.containsKey(codigoAluno) -> {
                alunoAux = listaDeAlunos.getValue(codigoAluno)
                var validaMatricula = listaDeCursos[codigoCurso]?.adicionarUmAluno(alunoAux)
                when {
                    validaMatricula == true -> {
                        var data = Date()
                        var cursoAux = listaDeCursos.getValue(codigoCurso)
                        listaDeMatriculas.add(Matricula(alunoAux, cursoAux, data))
                    }
                    else -> println("[Digital Manager] - Não há vagas disponíveis")
                }
            }
            else -> println("[Digital Manager] - Curso ou Aluno não encontrado, revise os dados.")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        
    }

}