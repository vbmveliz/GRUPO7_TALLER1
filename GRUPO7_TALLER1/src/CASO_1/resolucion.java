package CASO_1;
import javax.swing.JOptionPane;

public class resolucion {

    public static void main(String[] args) {

        while (true) {

            // Pedir números
            String num1Str = JOptionPane.showInputDialog("Ingresa el primer número:");
            String num2Str = JOptionPane.showInputDialog("Ingresa el segundo número:");

            double num1, num2;

            try {
                num1 = Double.parseDouble(num1Str);
                num2 = Double.parseDouble(num2Str);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa solo números");
                continue;
            }

            // Menú
            String opcionStr = JOptionPane.showInputDialog(
                    "Elige una operación:\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir"
            );

            int opcion;

            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción inválida");
                continue;
            }

            double resultado;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;

                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                    } else {
                        resultado = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    return; // termina el programa

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}