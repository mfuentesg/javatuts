/**
* @author Marcelo Fuentes
**/

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona("youtube", 500);
		System.out.println(p.getNombre()+" tiene "+p.getEdad()+" años de edad");
		Persona p1 = new Persona();
		System.out.println(p1.getNombre()+" tiene "+p1.getEdad()+" años de edad");
	}
}