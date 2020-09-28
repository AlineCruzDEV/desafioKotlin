package br.digitalhouse.com.desafioKotlin

class DigitalHouseManager(
        var listaDeAlunos: MutableList<Aluno>,
        var listaDeProfessores: MutableList<Professor>,
        var listaDeCursos: MutableList<Curso>,
        var listaDeMatriculas: MutableList<Matricula>
) {
    init {
        println("Digital Manager inicializada.")
        println("Alunos:")
        listaDeAlunos.forEach { println(it.nome) }
        println()
        println("Professores:")
        listaDeProfessores.forEach { println(it.nome) }
        println()
        println("Cursos:")
        listaDeCursos.forEach { println(it.nome) }
        println()
        println("Data Matriculas:")
        listaDeMatriculas.forEach { println(it.data) }
        println()
    }
}