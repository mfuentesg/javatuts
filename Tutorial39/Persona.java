/**
 *
 * @author Marcelo
 */
public class Persona implements java.io.Serializable {
    
    private String nombre;
    private String apellido;
    private int edad;
    private transient int excluded = 1; // NULL
    
    public Persona (String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    
    public int getExcluded () {
        return excluded;
    }
}
