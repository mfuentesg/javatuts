/**
* @author Marcelo Fuentes
**/

public class Main {
	public static void main(String[] args) {
		Persona javier = new Persona("Javier", 22 ,true);
		javier.mostrarInformacion();
		Persona gloria = new Persona("Gloria", 21 ,false);
		gloria.mostrarInformacion();
		Persona martin = new Persona("Martin", 1 ,true);
		martin.mostrarInformacion();
	}
}