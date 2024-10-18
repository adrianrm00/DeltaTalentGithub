import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        double numero1 = 0;
        double numero2 = 0;

        do {

            System.out.println("Bienvenido a la calculadora");
            System.out.println("Seleccione una operación:");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División");
            System.out.println("5: Salir");

            opcion = scanner.nextInt();


            if (opcion < 5 && opcion > 0) {
                System.out.println("Introduce el primer número:");
                numero1 = scanner.nextDouble();
                if (opcion == 4) {
                    do {
                        System.out.println("Introduce el segundo número (no puede ser 0 para la división):");
                        numero2 = scanner.nextDouble();
                        if (numero2 == 0) {
                            System.out.println("Error: No se puede dividir entre 0. Introduce otro número.");
                        }
                    } while (numero2 == 0); // Repetir hasta que el segundo número no sea 0
                } else {
                    System.out.println("Introduce el segundo número:");
                    numero2 = scanner.nextDouble();
                }
            }


            Operacion operacion = null;

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
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if(operacion != null){
                System.out.println("El resultado es: " + operacion.calcular() + "\n\n");
            }


        }
        while (opcion != 5);

        scanner.close();

    }
}