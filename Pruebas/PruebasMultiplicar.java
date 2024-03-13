import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebasMultiplicar {
    @Test
    void testMultiplicar() {

        Multiplicacion multiplicar = new Multiplicacion();


        double num1 = 2.0;
        double num2 = 3.0;


        double resultado = multiplicar.Multiplicar();
        assertEquals(num1 * num2, resultado);

    }
    @Test
    void testMultiplicar1() {

        Multiplicacion multiplicar = new Multiplicacion();


        double num1 = 2.0;
        double num2 = 2.0;


        double resultado = multiplicar.Multiplicar();
        assertEquals(num1 * num2, resultado);

    }
    @Test
    void testMultiplicar2() {

        Multiplicacion multiplicar = new Multiplicacion();


        double num1 = 2.0;
        double num2 = 5.0;


        double resultado = multiplicar.Multiplicar();
        assertEquals(num1 * num2, resultado);

    }
}

