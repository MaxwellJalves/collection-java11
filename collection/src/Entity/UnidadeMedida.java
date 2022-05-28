package Entity;

public enum UnidadeMedida {

    UN("unidade(s)"),
    LT("litro(s)"),
    KG("quilo(s)"),

    private String name;
    UnidadeMedida(String value){
        this.name = value;
    }


    public String getName(){
        return this.name;
    }
}
