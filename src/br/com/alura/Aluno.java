package br.com.alura;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "Nome = " + nome +
                ", NumeroMatricula = " + numeroMatricula +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }

    /*
    * Entrando na classe String do Java, vemos que ela tem o método hashCode implementado, e ele já faz uma conta bem difícil,
    *  para que haja o melhor espalhamento e assim, a busca seja bastante eficiente. Então, podemos fazer com que o nosso hashCode
    *  devolva o hashCode da String nome:
    * */
    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }
}