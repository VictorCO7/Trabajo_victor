import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int menu;

        do {
            System.out.println("La calculadora tiene las siguientes opciones:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.print("¿Qué opción quieres realizar?: ");

            menu= sc.nextInt();


            switch (menu) {
                case 1:
                    double TotalSuma = calculadora.sumar();
                    System.out.println("La suma es: " + TotalSuma);
                    break;
                case 2:
                    double TotalResta = calculadora.restar();
                    System.out.println("La resta es: " + TotalResta);
                    break;
                case 3:
                    double TotalMultiplicacion = calculadora.multiplicar();
                    System.out.println("La multiplicación es: " + TotalMultiplicacion);
                    break;
                case 4:
                    double TotalDivision = calculadora.dividir();
                    System.out.println("La división es: " + TotalDivision);
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (menu != 0);
    }
}