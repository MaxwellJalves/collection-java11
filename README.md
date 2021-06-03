# Collection - java11
Trabalhando com Collections - List - Set- Map e Stream

-Collection é um objeto que agrupa múltiplos elementos(variáveis primitivas ou objetos)
dentro de uma única unidade.

- Serve para armazenar e processar conjuntos de dados de forma eficiente;
- Antes do Java 2 (JDK 1.2), a implementação de coleções na linguagem java incluia
poucas classes e não tinha a organização do framework.
  

# Composição.

- Intefaces: É um contrato que quanto assumido por uma classe deve ser implementado.
- Implementações ou Classe: são as materializações, a codificação das interfaces.
- Algoritmos : Que é a sequência lógica , finita e definida de intruções que devem ser 
seguidas para resolver um problema.
  
# Exercicio:
Analise da HJierarquida co Collections Framework.

## INTERFACE List - package java.util.List

### Caracteristicas
- Permite Elementos duplicados e garante a ordem na inserção
- Implementação -[Vector] é utilizado em threads
- ArrayList     -[List  ] Deve ser usado onde mais operações de pesquisa são necessárias.
- LinkedList    -[implements (List::Queue)] Deve ser usado one mais operações de inserção e exlusão são necessárias.

![hierarquia collections](https://user-images.githubusercontent.com/65586669/120273500-f5c91600-c284-11eb-90bc-611dba159999.jpg)

Incluido ao Projeto um arquivo XML para poder Implementar e estrutuar um Schema e complexTypes ao projeto

