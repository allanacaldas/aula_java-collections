package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        // O código abaixo dispara a exceção "UnsupportedOperationException" porque um conjunto destinado a ser vazio não pode ter um elemento, certo?
        /*
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");
        System.out.println(nomes);
        */

        //Equals e hashCode
        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));


        //Personalizando o método equals
        Aluno turini = new Aluno("Rodrigo Turini", 34672);

        System.out.println("O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));

        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        /* Ainda que o nome e a matrícula do aluno sejam idênticas, ao instanciar outro objeto (new Aluno())
        o equals() e o hashCode entendem que são objetos diferentes, fazem referência a objetos diferentes.
        Por isso, é necessário que ambos sejas reescritos na classe de Aluno*/
    }
}
