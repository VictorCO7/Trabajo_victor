import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebasDividir {
    @Test
    void testDividir() {

        Division dividir = new Division();


        double num1 = 2.0;
        double num2 = 3.0;


        double resultado = dividir.Dividir();
        assertEquals(num1 / num2, resultado);

    }


        @Test
        void testDividir1() {

            Division dividir = new Division();


            double num1 = 5.0;
            double num2 = 3.0;


            double resultado = dividir.Dividir();
            assertEquals(num1 / num2, resultado);

        }


            @Test
            void testDividir2() {

                Division dividir = new Division();


                double num1 = 4.0;
                double num2 = 3.0;


                double resultado = dividir.Dividir();
                assertEquals(num1 / num2, resultado);

            }
        }





