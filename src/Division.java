import java.util.Scanner;
class Division {
    public double Dividir() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce dos números para dividir: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
}