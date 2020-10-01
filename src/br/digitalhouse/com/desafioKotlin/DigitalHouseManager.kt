package br.digitalhouse.com.desafioKotlin

import java.util.*

class DigitalHouseManager {

    var listaDeAlunos = mutableMapOf<Int, Aluno>()
    var listaDeProfessores = mutableMapOf<Int, Professor>()
    var listaDeCursos = mutableListOf<Curso>()
    var listaDeMatriculas = mutableListOf<Matricula>()

    //registra um curso e coloca na listaDeCursos
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) = listaDeCursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))

    //exclui um curso pelo seu código
    fun excluirCurso(codigoCurso: Int) {
        listaDeCursos.forEach {
            when {
                it.codigoCurso == codigoCurso -> {
                    listaDeCursos.remove(it)
                    println("<Digital House> Curso excluído com sucesso")
                }
            }
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
                println("<Digital House> Professor excluido com sucesso!")
            }
            else -> println("<Digital House> Professor não existe!")
        }
    }

    //registrar um aluno
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) = listaDeAlunos.put(codigoAluno, Aluno(nome, sobrenome, codigoAluno))

    //matricular um aluno em um curso
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var alunoAux: Aluno

        listaDeCursos.forEach {
            when {
                (it.codigoCurso == codigoCurso && listaDeAlunos.containsKey(codigoAluno)) -> {
                    alunoAux = listaDeAlunos.getValue(codigoAluno)

                    var validaMatricula = it.adicionarUmAluno(alunoAux)

                    when {
                        validaMatricula == true -> {
                            var data = Date()
                            listaDeMatriculas.add(Matricula(alunoAux, it, data))
                        }
                        else -> println("<Digital House> Não há vagas disponíveis no curso ${it.nome}. O aluno ${alunoAux.nome} poderá se matricular em outros cursos.")
                    }
                }
            }
        }
    }

    //alocar professores titular e adjunto em um determinado curso
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        listaDeCursos.forEach {
            when {
                it.codigoCurso == codigoCurso -> {
                    var titular= listaDeProfessores.getValue(codigoProfessorTitular)
                    var adjunto = listaDeProfessores.getValue(codigoProfessorAdjunto)

                    it.professorTitular = titular as ProfessorTitular
                    it.professorAdjunto = adjunto as ProfessorAdjunto

                    println("<Digital House> Alocados professores ${it.professorTitular!!.nome} (Titular) e ${it.professorAdjunto!!.nome} (Adjunto) ao curso ${it.nome}")
                }
            }
        }
    }
}