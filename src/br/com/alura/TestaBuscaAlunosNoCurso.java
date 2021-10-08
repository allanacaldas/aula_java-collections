package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno);

        //Adicionando um aluno com uma matrícula já existente e testando se é possível coexistirem dois alunos nessa condição
        Aluno a4 = new Aluno("Paulo Silveira", 5617);
        javaColecoes.matricula(a4);

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno aluno2 = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno2);

        /*
        Resultado: não é possível, visto que a chave (matricula) que definimos na declaração do Map precisa ser única

        Então o que acontece? Ao adicionarmos um novo aluno com o mesmo número de matrícula de outro já existente, o mais
        antigo é esquecido pelo Map e o novo se torna o valor relacionado àquela matrícula.

        Apenas o último elemento adicionado (o Aluno a4) com aquela matrícula é lembrado*/

}
}
