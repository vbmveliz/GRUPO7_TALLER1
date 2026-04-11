package CASO_4;

//Cod. Alumno: N00305260
//Nombre y Apellidos: Gerson tafur bernabe

public class Contador {
    // Variable estática compartida por todos los objetos
    private static int contador = 0;

    // Constructor: incrementa el contador cada vez que se crea un objeto
    public Contador() {
        contador++;
        System.out.println("Objeto creado : " + contador);
    }

    // Método estático para obtener el valor del contador
    public static int getContador() {
        return contador;
    }

    // Main para probar
    public static void main(String[] args) {
        Contador obj1 = new Contador();
        Contador obj2 = new Contador();
        Contador obj3 = new Contador();

        System.out.println("Total de objetos creados: " + Contador.getContador());
    }
}