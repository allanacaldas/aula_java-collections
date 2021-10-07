package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

    /* Um conjunto, um set, não temos garantia da ordem em que os elementos vão ficar dentro desse conjunto, desse
    "saco de objetos". Um conjunto (diferente de uma lista, que representa uma sequência de objetos) é uma "sacola",
    e lá dentro está cheio de objetos, e você não sabe em que ordem eles estão.*/

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        System.out.println(alunos);
        System.out.println();

        //O método get() não existe nos Sets. Já que não tem ordem dos elementos, não é possível capturar uma posição específica
        //alunos.get()

        //O uso do foreach é possível
        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }

        // 1ª Vantagem: Não permite a inserção de elementos repetidos, vamos testar abaixo
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        System.out.println();
        System.out.println("Resultado depois da tentativa de inserção de alunos repetidos: " + alunos);

        /*2ª vantagem: Performance -> O método contains() da interface mãe Collection é executado mais rapidamente quando estamos buscando um elemento dentro de um HashSet
        O contains de uma lista faz uma busca linear, ou seja, busca elemento por elemento, para verificar que "Paulo Silveira" não se encontra no meio dos objetos da coleção.
        Já o HashSet utiliza uma tabela de espalhamento para tentar fazer a busca em tempo constante, tornando a busca mais rápida.
        */


        boolean estaPresente = alunos.contains("Paulo Silveira");
        System.out.println(estaPresente);

        //Transformando HashSet em Listas, para ordená-las e buscar um item pelo seu indice
        Collection<String> alunos2 = new HashSet<String>();
        alunos2.add("Nico Steppat");
        alunos2.add("Sergio Lopes");
        alunos2.add("Renan Saggio");

        List<String> alunos2EmLista = new LinkedList<>(alunos2);
        System.out.println(alunos2EmLista);
        System.out.println(alunos2EmLista.get(0));

    }
}