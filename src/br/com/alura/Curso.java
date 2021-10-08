package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    // Queremos que para cada matrícula, haja um aluno associado. Por isso, a interface Map é indicada nesses casos.
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        //Através do unmodifiableList, devolvemos uma cópia da lista de aulas sem permitir que ela possa ser alterada ou que seja adicionada mais uma aula à ela.
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    //Calculando o tempo total de aulas do Curso
    public int getTempoTotal() {

//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal+=aula.getTempo();
//        }
//        return tempoTotal;

        return this.aulas.stream().mapToInt(aula -> aula.getTempo()).sum();
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    /*Modificaremos o método matricula para que, toda vez que um aluno seja adicionado na lista de alunos do curso,
     ele também seja associado a um número de matrícula*/
    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    @Override
    public String toString() {
        return "Curso: { " +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                ", alunos=" + alunos +
                " }";
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        return this.matriculaParaAluno.get(numero);
    }
}