public class Profesor {

	private String asignatura;
	private String nombreAlumno;

	public Alumno(BufferedReader in) {
		try {
			System.out.println("--- TURNO PROFESOR ---");
			System.out.println("Ingresa nombre alumno: ");
			nombreAlumno = in.readLine();
			System.out.println("Ingresa asignatura: ");
			asignatura = in.readLine();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getNombreAlumno() {
		return this.nombreAlumno;
	}

	public void mostrarInformacion(String nombre) {
		System.out.println("\n---INFORMACION PROFESOR ---");
		System.out.println("Nombre: "+nombre);
		System.out.println("Asignatura: "+asignatura);
	}
}