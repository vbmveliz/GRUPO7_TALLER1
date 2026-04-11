package CASO_5;
import java.util.ArrayList;

public class Neg_Estudiante {
	private static ArrayList<Ent_Estudiante> listEstudiantes = new ArrayList<>();
	
    public void agregarEstudiantes(Ent_Estudiante est) {
    	
    	listEstudiantes.add(est);
        System.out.println("¡Estudiante guardado exitosamente!");
    }
    
    public  void listarEstudiantes() {
        System.out.println("\n--- LISTA DE ESTUDIANTES---");
        
        if (listEstudiantes.isEmpty()) {
            System.out.println("No hay alumnos registrados todavía.");
        } else {

            for (Ent_Estudiante est : listEstudiantes) {
                System.out.println("Nombre : " + est.getNombre() + " Edad: " + est.getEdad() + " Sexo: " + est.getSexo() + " DNI :" + est.getDocumento());
            }
        }
    }
}
