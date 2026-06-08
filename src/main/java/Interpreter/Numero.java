package Interpreter;

public class Numero implements Expressao{

    private int valor;

    public Numero( int valor){
        this.valor = valor;
    }
    @Override
    public int interpreter(){
        return valor;
    }
}
