import java.util.Scanner;
class Multiplicacion {
    public double Multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos números para multiplicar: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return num1 * num2;
    }
}