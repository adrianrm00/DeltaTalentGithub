import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Seleccione una operación:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Salir");


        int opcion = scanner.nextInt();

        System.out.println("Introduce el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número:");
        double numero2 = scanner.nextDouble();

        Operacion operacion = null;

        do {

            switch (opcion) {
                case 1:
                    operacion = new Suma(numero1, numero2);
                    break;
                case 2:
                    operacion = new Resta(numero1, numero2);
                    break;
                case 3:
                    operacion = new Multiplicacion(numero1, numero2);
                    break;
                case 4:
                    operacion = new Division(numero1, numero2);
                    break;
                case 5:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.exit(0);
            }

            System.out.println("El resultado es: " + operacion.calcular());

        } while (opcion != 5) {
            scanner.close();
        }
    }
}