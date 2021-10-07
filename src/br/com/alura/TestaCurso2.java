package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println("Aulas sem ordenamento: " + aulas);
        //Collections.sort(aulas); -> Dispara uma exceção, pois estamos tentando ordenar uma lista imutável, que não permite nem adição, nem remoção nem ordenação

        //Lidando com alterações em listas imutáveis, como é o caso da lista "aulas"
        // Crie uma nova lista e passe a imutável como parâmetro do construtor e poderemos ordenar esta recem-criada:
        List<Aula> listaMutavel = new LinkedList<>(aulas);
        Collections.sort(listaMutavel);
        System.out.println("Aulas ordenadas: " + listaMutavel);

        System.out.println("Tempo total das aulas ordenadas " + javaColecoes.getTempoTotal() + " minutos");

        //Imprimindo os cursos
        System.out.println("Nosso cursos -> " + javaColecoes);
    }
}
