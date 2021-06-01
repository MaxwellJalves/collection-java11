package Entity;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nota {

    private Aluno aluno;
    private List<Double> notas = new ArrayList<>();

    public Nota(Aluno aluno, List<Double> notas) {
        this.aluno = aluno;
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public List<Double> getNotas() {
        return notas;
    }

    /*Recebe uma lista e retorna a posição solicitada para a view*/
    public static Double getPosicao(List<Nota> lista, int d){
      return  Double.valueOf(lista.indexOf(d));
    }

    @Override
    public String toString() {
        return "Nota{" +
                "aluno=" + aluno +
                ", notas=" + notas +
                '}';
    }
}
