package CASO_5;
import java.util.ArrayList;

public class Ent_Estudiante {
	
	
	private String nombre; 
    private int edad;
    private String sexo;
    private String documento;

    public Ent_Estudiante() {        
    }
    
    // Constructor
    public Ent_Estudiante(String nombre, int edad, String sexo, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.documento = documento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento;}

}
