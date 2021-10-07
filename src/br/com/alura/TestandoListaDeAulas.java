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


        // ->>> Ordenando uma lista de objetos

        //Collections.sort(aulas);
        /*No exemplo acima,até tentamos ordenar essa mesma lista de objetos usando o método estático sort() da classe
        Collections, mas esse simplesmente não compila porque ainda falta um critério de comparação: qual dessas duas aulas viria primeiro? qual o critério
        que pode ordená-las? No exemplo da aula anterior, tratava-se de uma lista de Strings que já tem um critério de comparação entre duas Strings,
        no qual qualquer pessoa pode comparar dois desses objetos. Isso é feito através do método compareTo.
        Para resolver o problema precisamos fazer com que nossa classe de Aula também seja um objeto comparável entre si,
        bastando que ela implemennte a interface Comparable e o seu metodo compareTo
        Depois que a implementamos e sobreescrevemos o metodo compareTo, podemos ordenar nossa lista seguindo critério estabelecido.
        */
        Collections.sort(aulas);
        System.out.println("Lista devidamente ordenada por ordem alfabética do titulo: " + aulas);




        //Ordenando nossos objetos segundo o método sort (que recebe um Comparator) da própria lista (novidade que o Java 8 trouxe)
        //Duas formas de ordenar seguindo mesmo critério de tempo de Duração das aulas
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(aula -> aula.getTempo()));
        System.out.println(aulas);



    }
}