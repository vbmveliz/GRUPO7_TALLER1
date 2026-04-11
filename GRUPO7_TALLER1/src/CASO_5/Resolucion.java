package CASO_5;
import java.util.Scanner;

public class Resolucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Neg_Estudiante objNegEstudiante = new Neg_Estudiante();
		System.out.println("Registro de Estudiante");
		
		boolean salir = false;
		
		while(!salir) {
			
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ingresar estudiantes");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");    
           
            try {
            	String strOpcion = scanner.nextLine();
                int opcion =Integer.parseInt(strOpcion); 
                
            	switch (opcion) {      	
					case 1:		

						System.out.println("\n-- INGRESO DE DATOS --");
				        
				        System.out.print("Nombre del Alumno: ");
				        String nombre = scanner.nextLine();
				        
				        System.out.print("Edad del Alumno: ");
				        int edad = scanner.nextInt();
				        scanner.nextLine(); 
				        
				        System.out.print("El sexo (M/F) del alumno: ");
				        String sexo = scanner.nextLine();
				        
				        System.out.print("Documento de Identidad: ");
				        String documento = scanner.nextLine();
				        
				        Ent_Estudiante objEstudiante = new Ent_Estudiante();	
				        objEstudiante.setNombre(nombre);
				        objEstudiante.setEdad(edad);
				        objEstudiante.setSexo(sexo);
				        objEstudiante.setDocumento(documento);
				        
				        objNegEstudiante.agregarEstudiantes(objEstudiante);						
						
						break;
					case 2:
						System.out.println("Mostrar listado de Estudiantes");
						objNegEstudiante.listarEstudiantes();
						break;
					case 3:
						System.out.println("\n--- Salir del Registro");
						salir = true;
						break;						
					default:
						System.out.println("ingrese la opción correcta 1, 2 o 3");
				}           	
            	
				
			} catch (Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
			
		}
		
		scanner.close();		
	}

	
}
