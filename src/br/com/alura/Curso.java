package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

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

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }
}