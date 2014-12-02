/**
* @author Marcelo Fuentes
**/

public class Persona {

	private String nombre;
	private int edad;
	private boolean sexo;

	public Persona(String n, int e, boolean sexo){
		nombre = n;
		edad = e;
		this.sexo = sexo;
	}

	public void mostrarInformacion(){
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
		if(!sexo){
			System.out.println("El sexo es: Femenino");	
		}else{
			System.out.println("El sexo es: Masculino");	
		}
		
	}

}