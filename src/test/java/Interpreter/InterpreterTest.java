package interpreter;

import static org.junit.jupiter.api.Assertions.*;

import Interpreter.Expressao;
import Interpreter.Numero;
import Interpreter.Soma;
import org.junit.jupiter.api.Test;

public class InterpreterTest {

    @Test
    void deveInterpretarNumero() {

        Expressao numero = new Numero(10);

        assertEquals(10, numero.interpreter());
    }

    @Test
    void deveSomarDoisNumeros() {

        Expressao n1 = new Numero(15);
        Expressao n2 = new Numero(25);

        Expressao soma = new Soma(n1, n2);

        assertEquals(40, soma.interpreter());
    }

    @Test
    void deveInterpretarExpressaoCompleta() {

        Expressao n1 = new Numero(10);
        Expressao n2 = new Numero(20);
        Expressao n3 = new Numero(30);

        Expressao soma1 = new Soma(n1, n2);

        Expressao expressao =
                new Soma(soma1, n3);

        assertEquals(60, expressao.interpreter());
    }
}
