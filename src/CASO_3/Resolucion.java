package CASO_3;

public class Resolucion {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        int sumad2Enteros = op.sumar(10, 20);
        double sumad2Doubles = op.sumar(15.5, 4.3);
        int sumad3Enteros = op.sumar(5, 10, 15);

        System.out.println("--- Resultados de Sobrecarga ---");
        System.out.println("Suma de 2 enteros (10 + 20): " + sumad2Enteros);
        System.out.println("Suma de 2 doubles (15.5 + 4.3): " + sumad2Doubles);
        System.out.println("Suma de 3 enteros (5 + 10 + 15): " + sumad3Enteros);
    }
}


