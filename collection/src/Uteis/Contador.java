package Uteis;

public class Contador {

    static private int CONTADOR= 0;

    public static int  getId(){
       Contador.CONTADOR += 1;
       return Contador.CONTADOR;
    }

}
