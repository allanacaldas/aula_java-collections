package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Aula 02 - Lista de Objetos
public class TestandoListaDeAulas {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);


        //Ordenando nossos objetos segundo o método sort (que recebe um Comparator) da própria lista (novidade que o Java 8 trouxe)
        //Duas formas de ordenar seguindo mesmo critério de tempo de Duração das aulas
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(aula -> aula.getTempo()));
        System.out.println(aulas);



    }
}