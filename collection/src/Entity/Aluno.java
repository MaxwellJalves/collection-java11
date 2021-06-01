package Entity;

public class Aluno {
    private int id;
    private String nome;


    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    public static Aluno getAluno(int codigo,String nome){

        return new Aluno(codigo,nome);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }



@Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +"Unidade de Medida" +
                '}';
    }

}
