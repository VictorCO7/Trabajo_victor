import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PruebasRestar {
    @Test
    void testRestar() {

        Resta resta = new Resta();


        double num1 = 2.0;
        double num2 = 3.0;


        double resultado = resta.Restar();
        assertEquals(num1 - num2, resultado);

    }
    @Test
    void testRestar1() {

        Resta resta = new Resta();


        double num1 = 4.0;
        double num2 = 3.0;


        double resultado = resta.Restar();
        assertEquals(num1 - num2, resultado);

    }
    @Test
    void testRestar2() {

        Resta resta = new Resta();


        double num1 = 2.0;
        double num2 = 2.0;


        double resultado = resta.Restar();
        assertEquals(num1 - num2, resultado);

    }
}
