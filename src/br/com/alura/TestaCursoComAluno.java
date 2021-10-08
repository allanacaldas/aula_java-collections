package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
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


        //Aprendendo a usar o Iterator (modo como acessavam os elementos de um Set antes do Java 5)
        Set<Aluno> alunos = javaColecoes.getAlunos(); //toda coleção possui Iterator, podemos pegá-lo usando o método de mesmo nome
        Iterator<Aluno> iterador = alunos.iterator();

        /*
        * Com o iterador em mãos, existem dois métodos que costumamos usar. O primeiro é o método hasNext, que devolve um booleano dizendo
        * se há ou não um próximo elemento na coleção. Então a primeira pergunta que sempre fazemos para o iterador é: "tem um próximo elemento na coleção?".
        * Até porque se não houver um próximo elemento, não iremos querer pegá-lo. O segundo método é o next, que justamente devolve o próximo elemento.
        *
        * */

        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
