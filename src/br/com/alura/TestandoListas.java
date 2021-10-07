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
        System.out.println("Aulas: " + aulas);

        //Removendo elementos
        aulas.remove(0);
        System.out.println("Resultado da lista após a remoção do primeiro item: " + aulas);

        //Percorrendo uma lista - Enhanced for (comando foreach)
        for (String aula : aulas) {
            System.out.println("Aula" + aula);
        }
        //Outra forma de percorrer a lista usando o for
        //Nesse modo, precisamos saber quantos elementos há nessa lista e faremos isso usando o size()
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula " + i + ": " + aulas.get(i));
        }

        //Percorrendo elementos da lista com Java 8 (método foreach)
        //Traduzindo o método abaixo: para cada aula (item da lista), execute as duas linhas de código em seguida (System.out.println)
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });


        //Acessando elementos
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
    }
}