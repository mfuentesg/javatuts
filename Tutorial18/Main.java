/**
* @author Marcelo Fuentes
*/

import java.io.*;

public class Main {

	public static void main(String[] args) {
		File f = new File("C:\\tutorial\\youtube.txt");

		try {
			if (f.exists()) {
				BufferedReader in = new BufferedReader(new FileReader(f));
				while ((linea = in.readLine()) != null) {
					contenido += linea + "\n";
				}
				in.close();
				f = new File("C:\\tutorialclon");
				f.mkdir();

				f = new File("C:\\tutorialclon\\youtubeclon.txt");
				char c[] = contenido.toCharArray();

				PrintWriter pw = new PrintWriter(f);

				for (int i = 0; i < c.length; i++) {
					if (c[i] == '\n') {
						pw.println();
					} else {
						pw.append(c[i]);
					}
				}
				pw.close();
				System.out.println("Objetivo realizado!");
			} else {
				System.out.println("El archivo fue removido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}