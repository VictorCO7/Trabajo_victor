import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Suma suma = new Suma();
    Resta resta = new Resta();
    Multiplicacion multiplicacion = new Multiplicacion();
    Division division = new Division();

    int menu;

    do {
        System.out.println("La calculadora tiene las siguientes opciones:");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("0.- Salir");
        System.out.print("¿Qué opción quieres realizar?: ");

        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("La suma es: " + suma.Sumar());
                break;
            case 2:
                System.out.println("La resta es: " + resta.Restar());
                break;
            case 3:
                System.out.println("La multiplicación es: " + multiplicacion.Multiplicar());
                break;
            case 4:
                System.out.println("La división es: " + division.Dividir());
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
        }
    } while (menu != 0);
}
