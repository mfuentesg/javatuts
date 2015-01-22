import java.util.Random;

public class Matriz {
	// private int matriz[][] = {{1,2,3},{1,2,3}};
	private int matriz[][];
	private Random random;

	public Matriz() {
		this.matriz = new int[3][3];
		random = new Random();
	}

	public void llenarMatriz() {
		try {
			for(int i = 0; i<matriz.length; i++) {
				for (int j = 0; j<matriz.length; j++) {
					matriz[i][j] = random.nextInt(20);
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void imprimirMatriz() {
		for(int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}