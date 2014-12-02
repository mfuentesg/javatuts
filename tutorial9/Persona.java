/**
* @author Marcelo Fuentes
**/

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(){
		nombre = "krupf";
		edad = 200;
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

}