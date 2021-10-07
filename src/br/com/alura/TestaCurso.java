package br.com.alura;

import java.util.List;

//Criada na aula 03
public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //Apenas a classe Curso deve ter acesso às aulas
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));


        System.out.println(javaColecoes.getAulas()); // A lista de Aulas está preenchida
    }
}