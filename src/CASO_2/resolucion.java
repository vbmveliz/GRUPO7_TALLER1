package CASO_2;

public class resolucion {
	public static void main(String[] args) {

	    Persona p1 = new Persona("Ana", 20);
	    Persona p2 = new Persona("Luis", 25);

	    System.out.println("----- Persona 1 -----");
        p1.mostrarDatos();

        System.out.println("----- Persona 2 -----");
        p2.mostrarDatos();
	}
}
