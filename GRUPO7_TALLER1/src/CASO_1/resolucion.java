package CASO_1;

import javax.swing.JOptionPane;

public class resolucion {

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            Double num1 = leerNumero("Ingrese el primer número:");
            if (num1 == null) break;

            Double num2 = leerNumero("Ingrese el segundo número:");
            if (num2 == null) break;

           
            String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};

            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una operación",
                    "Calculadora",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion == -1 || seleccion == 4) {
                JOptionPane.showMessageDialog(null, "Programa finalizado 👋");
                break;
            }

            double resultado = 0;

            try {
                switch (seleccion) {
                    case 0:
                        resultado = sumar(num1, num2);
                        break;
                    case 1:
                        resultado = restar(num1, num2);
                        break;
                    case 2:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 3:
                        resultado = dividir(num1, num2);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        continue;
                }

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error: División por cero");
                continue;
            }

            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea realizar otra operación?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION
            );

            if (respuesta != JOptionPane.YES_OPTION) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado 👋");
            }
        }
    }

    public static Double leerNumero(String mensaje) {

        while (true) {

            String input = JOptionPane.showInputDialog(null, mensaje);

            if (input == null) {
                return null;
            }

           
            if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede estar vacío");
                continue;
            }

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido");
            }
        }
    }

    // Métodos
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