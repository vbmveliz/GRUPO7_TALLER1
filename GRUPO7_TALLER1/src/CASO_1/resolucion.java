package CASO_1;

import java.util.Scanner;

public class resolucion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            Double num1 = leerNumero(sc, "Ingrese el primer número:");
            if (num1 == null) break;

            Double num2 = leerNumero(sc, "Ingrese el segundo número:");
            if (num2 == null) break;

            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opcion = -1;

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida");
                continue;
            }

            double resultado = 0;

            try {
                switch (opcion) {
                    case 1:
                        resultado = sumar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 2:
                        resultado = restar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 4:
                        resultado = dividir(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida");
                        continue;
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir entre cero");
                continue;
            }

            if (continuar) {
                System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                String respuesta = sc.nextLine();

                if (!respuesta.equalsIgnoreCase("s")) {
                    continuar = false;
                    System.out.println("Programa finalizado ");
                }
            }
        }

        sc.close();
    }
    
    public static Double leerNumero(Scanner sc, String mensaje) {

        while (true) {
            System.out.print(mensaje + " ");
            String input = sc.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("No puede estar vacío");
                continue;
            }

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
            }
        }
    }

    // MÉTODOS
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
