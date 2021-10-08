# Anotações - Java Collections: Dominando Listas, Sets e Mapas

Nesse resumo, foram destacados pontos imporntantes dos estudos do curso **Java Collections: Dominando Listas, Sets e Mapas** (Formação Java e OO) da Alura ministrado pelo Professor **Paulo Silveira** e cada commit tem a finalidade registrar o que foi aprendido em cada aula do treinamento.

# Aula 02 - Lista de Objetos

## **LinkedList ou ArrayList?**

E o mistério da `LinkedList`? E se tivéssemos usado `ArrayList` na declaração do atributo `aulas` da classe `Curso`? O resultado seria exatamente o mesmo!

Então qual é a diferença? Basicamente performance. O `ArrayList`, como diz o nome, internamente usa um *array* para guardar os elementos. Ele consegue fazer operações de maneira muito eficiente, como invocar o método `get(indice)`. Se você precisa pegar o décimo quinto elemento, ele te devolverá isso bem rápido. Quando um `ArrayList` é lento? Quando você for, por exemplo, inserir um novo elemento na primeira posição. Pois a implementação vai precisar mover todos os elementos que estão no começo da lista para a próxima posição. Se há muitos elementos, isso vai demorar... Em computação, chamamos isso de **consumo de tempo linear**.

Já o `LinkedList` possui uma grande vantagem aqui. Ele utiliza a estrutura de dados chamada **lista ligada**, e é bastante rápido para adicionar e remover elementos na *cabeça* da lista, isto é, na primeira posição. Mas é lento se você precisar acessar um determinado elemento, pois a implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo.

Confuso? Não tem problema. Sabe o que é interessante? Você não precisa tomar essa decisão desde já e oficializar para sempre. Como utilizamos a referência a `List`, comprometendo-nos pouco, podemos *sempre* mudar a implementação, isso é, em quem damos `new`, caso percebamos que é melhor uma ou outra lista nesse caso em particular.

# Aula 05 - O poder dos sets

Um conjunto, um set, não temos garantia da ordem em que os elementos vão ficar dentro desse conjunto, desse "saco de objetos". Um conjunto (diferente de uma lista, que representa uma sequência de objetos) é uma "sacola",e lá dentro está cheio de objetos, e você não sabe em que ordem eles estão.

### Características:

- Um conjunto não aceita elementos repetidos;
- Há métodos que fazem busca por um objeto, como contains(..) ou remove(..), que são muito mais rápidos se comparado com uma lista;
- Um conjunto não garante a ordem de inserção

# Aula 07 - Equals e HashCode

## **O método hashCode**

Vamos à explicação: a estrutura `Set` usa uma **tabela de espalhamento** para realizar mais rapidamente suas buscas. Imagine que cada vez que você adiciona algo dentro do seu `Set` para espalhar os objetos, um número mágico é gerado e todos os objetos que o tenham são agrupados. E ao buscar, em vez de comparar o objeto com todos os outros objetos contidos dentro do `Set` (isso daria muitas comparações), ele gera novamente o mesmo número mágico, e compara apenas com aqueles que também tiveram como resultado esse número. Ou seja, ele compara apenas dentro do grupo de semelhança. No caso da matricula não reconhecida, o aluno `a1` estava num grupo diferente de `turini`, e por isso o método `contains` não conseguia encontrá-lo.

Como é gerado esse número mágico? Utilizando o método hashCode, por isso precisamos sobrescrevê-lo, mudando-o para quando criarmos um objeto Aluno com o mesmo nome, que esses objetos gerem o mesmo hashCode e portanto, fiquem no mesmo grupo.

```java
@Override
public int hashCode(){
    return this.nome.hashCode();
}
```

### O que aprendemos nessa aula:

- Implementação das nossas próprias regras de comparação entre objetos de uma mesma classe.
- Sobrescrita do método `equals`.
- A necessidade de sobrescrever o método `hashCode` quando o `equals` for sobrescrito.

# Aula 08 - Outros Sets e Iterators

LinkedHashSet é a implementação de Set que guarda a ordem em que os elementos foram adicionados e na hora de percorrer o conjunto com um foreach os seus elementos virão na ordem em que foram adicionados; mas mesmo utilizando LinkedHashSet, não conseguimos invocar o método get.

# Aula 10 - Mapas

Que estrutura de dados permite que, dado um número (a matrícula), teremos um aluno associado correspondente, como se fosse uma tabela? O nome da estrutura que faz muito bem isso é o Map. Vale ressaltar que Map não é uma implementação de Collection, ele é uma interface por si só.

Map é muito bom em fazer associações. No nosso caso, queremos fazer uma associação entre um número inteiro (Integer) e um aluno (Aluno). Como podemos fazê-la, então? Devemos fazer isso dentro da nossa classe Curso, pois nossa intenção inicial era exatamente isso: buscar um aluno dentro de um curso. A implementação de Map mais usada é o HashMap

Estamos fazendo algo parecido com uma tabela Excel. Temos duas colunas aluno e matricula e vamos adicionando (put) a chave matricula e o valor aluno.

Lembrando que a chave que definimos na declaração do Map tem que ser única.

### Outras implementações

O HashMap é uma das implementações mais usadas de Map. Mas temos outras como o LinkedHashMap, bastante parecido com o LinkedHashSet, que guarda a ordem de inserção. Ou seja, se fôssemos imprimir o LinkedHashMap, a impressão apareceria na ordem em que foi inserida.