public class Alumno {

	private int edad;
	private String nombreProfesor;

	public Alumno(BufferedReader in) {
		try {
			System.out.println("--- TURNO ALUMNO ---");
			System.out.println("Ingresa tu edad: ");
			edad = Integer.parseInt(in.readLine());
			System.out.println("Ingresa nombre profesor: ");
			nombreProfesor = in.readLine();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void mostrarInformacion(String nombre) {
		System.out.println("\n---INFORMACION ALUMNO ---");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}

	public String getNombreProfesor() {
		return this.nombreProfesor;
	}
}