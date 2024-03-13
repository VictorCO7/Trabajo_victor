import java.util.Scanner;
class Suma {
    public double Sumar( ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos números para sumar: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return num1 + num2;
    }
}
