package programacion.dam.tarea9.beans;

/**
 *
 * @author Roach
 */
public class Persona {
    
    // Atributos
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    
    // Constructores
    public Persona(){
    }
    
    public Persona(String nombre, String apellidos, String fechaNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}