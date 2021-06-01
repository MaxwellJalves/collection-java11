package view;


import Entity.Produto;
import Entity.UnidadeMedida;
import Uteis.Contador;

import java.util.Scanner;

public class ProdutoForm {

    public static void main(String[] args) {
        String nome = "";
        Scanner in =  new Scanner(System.in);
        boolean continuar = true;

        System.out.println("CADASTRO DE PRODUTOS");

        while (continuar==true){
            System.out.println("Informe o nome do produto.");
            nome = String.valueOf(in.nextLine());
            Produto produto = new Produto(Contador.getId(),nome,UnidadeMedida.UN);
            Produto.Adicionar(produto);

            System.out.println("Deseja inserir um novo produto? 1 -Sim : 2 - Não");
            if(!in.nextLine().equals("2")){
                Produto.listarItens();
                System.out.println("######MERCADINHO MELHOR PREÇO#####");
                continue;
            }else{
                continuar = false;
                System.out.println("######ITENS VENDIDOS#####");
                Produto.listarItens();
                System.out.println("######FINALIZANDO APLICAÇÃO#####");

            }
        }
    }

}
