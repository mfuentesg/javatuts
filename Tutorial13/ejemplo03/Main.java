import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			Alumno a = new Alumno(in);
			Profesor p = new Profesor(in);
			a.mostrarInformacion(p.getNombreAlumno());
			p.mostrarInformacion(a.getNombreProfesor());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}