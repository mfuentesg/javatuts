import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0, contador = 0, vector[] = new int[6];
		Random r = new Random();
		Ejemplo02 e;

		while(contador != 6) {
			vector[contador++] = r.nextInt(15);
		}
		System.out.println("MENU\n\n1. Ascendente\n2. Descendente\n\nIngresa la opción: ");

		try {
			opcion = Integer.parseInt(in.readLine());
			e = new Ejemplo02(vector);

			switch(opcion) {
				case 1: e.ordenarAsc(); break;
				case 2:	e.ordenarDesc(); break;
				default: System.out.println("opcion invalida");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}