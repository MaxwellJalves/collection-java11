package Entity;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int id;
    private String nome;
    private UnidadeMedida un;
    public static List<Produto> listaDb = new ArrayList<>();

    public Produto(int id, String nome, UnidadeMedida un) {
        this.id = id;
        this.nome = nome;
        this.un = un;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public UnidadeMedida getUnidadeMedida() {
        return un;
    }
    
    public static boolean Adicionar(Produto produto) {
        try{
            Produto.listaDb.add(produto);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    public static void listarItens(){
        for(Produto p : Produto.listaDb){
            System.out.println(p);
        }
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", un=" + un +
                '}';
    }
}
