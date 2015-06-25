/**
* @author Marcelo Fuentes	
*/

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = "";
		int edad = 0;
		try {
			//Persona p[] = new Persona[3];
			ArrayList <Persona> p = new ArrayList();

			for (int i = 0; i < p.length; i++) {
				System.out.println("Ingresa nombre persona " + o + ": ");
				nombre = in.readLine();
				System.out.println("Ingresa edad persona " + o + ": ");
				edad = Integer.parseInt(in.readLine());

				//p[i] = new Persona(nombre, edad);
				p.add(new Persona(nombre, edad));
			}

			for (Persona p1 : p) {
				System.out.println("Nombre: " + p1.getNombre() + "\nEdad: " + p1.getEdad());
				System.out.println("*******************");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}