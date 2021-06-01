package view;

import Entity.Aluno;
import Entity.Nota;
import Entity.UnidadeMedida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

/**
 * Generics(jdk5)  e Diamond Operator
 * 1- data uma lista com 7 notas de um aluno [7,8.5,7.3,5,7,0,3.6] faça:
 * */
public class Exercicio1FormList {

    public  static int CONTADOR = 0;


    public static void main(String[] args) {

        /**
         * - CRIE 2 ALUNOS E ATRIBUA 7 NOTAS PARA CADA ,
         * - O CODIGO DO ALUNO DEVE SER GERADO DE FORMA AUTOMATICA.
         * - IMPLEMENTE INTERFACE QUE GARANTA A ORDEM DE INSERÇÃO
         * */
        Aluno a = Aluno.getAluno(contadorDeAlunos(),"Maxwell");
        Nota nota = new Nota(a, Arrays.asList(7d,8.5,7.3,5.0,7d,1d,3.6));
        System.out.println(nota);

        Aluno a2 = Aluno.getAluno(contadorDeAlunos(),"Joao");
        Nota nota2 = new Nota(a2, Arrays.asList(7d,8.5,7.3,5.0,7d,1d,3.6));
        System.out.println(nota2);


        /**
         * - RETORNE UMA UNICA LISTA COM TOSDOS OS DADOS INSERIDOS  E EXIBIDOS ANTERIORMENTE
         * */
        System.out.println("########----------------------------#######");
        List<Nota> listao = new ArrayList<>();
        listao.add(nota);
        listao.add(nota2);

        for(Nota n : listao){
            if(n.getAluno().getNome().contains("Maxwell") == true){
                System.out.println("Aluno Reprovado");
                break;
            }
            System.out.println(n.getAluno().getNome());
        }

        listao.forEach(e ->System.out.println(e));

        /** EXIBA A POSIÇÃO DA NOTA 7*/

        List<Double> n = new ArrayList<>();
        n.add(2d);
        n.add(7d);
        n.add(9d);
        n.add(10d);
        System.out.println("\nPosição da nota 7 : " + n.indexOf(7d));

        //Criando metodo Generico
        System.out.println("\nPosição da nota 7 : " +Nota.getPosicao(listao,7));


        /**Adicione o valor 2.3 na posicao 2*/
        n.add(2,2.3);
        System.out.println(n+"\n");

        /**Subistitua a nota 7 por 10*/
        n.set(n.indexOf(7d),10d);
        System.out.println(n+"\n");

        /**Verifique se a nota 5 existe dentro da lista*/
        System.out.println(n.contains(5d)? "Existe o valor 5 na lista" : "Dados não localizado");

        /**Retorne a menor nota*/
        System.out.println("Menor Nota: \t"+Collections.min(n));
        /**Retorne a Maior nota*/
        System.out.println("Maior Nota: \t"+Collections.max(n));

    }

    static int contadorDeAlunos() {
        Exercicio1FormList.CONTADOR +=1;
        return Exercicio1FormList.CONTADOR;
    }

}
