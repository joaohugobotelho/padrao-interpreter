package Interpreter;

public class Soma implements Expressao{

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita){
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpreter(){
        return esquerda.interpreter() + direita.interpreter();
    }
}
