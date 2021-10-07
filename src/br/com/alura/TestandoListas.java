package br.com.alura;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        //Adicionando elementos numa lista
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        //Removendo elementos
        aulas.remove(0);
        System.out.println(aulas);

        //Percorrendo uma lista
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //Acessando elementos
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
    }
}