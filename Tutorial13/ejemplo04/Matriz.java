public class Matriz {

	private int matriz[][];

	public Matriz() {
		matriz = new int [9][9];
		for(int i = 0; i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				if (j < (i+1)) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = matriz[i][j-1] + 1;
				}
			}
		}
	}

	public void mostrarMatriz() {
		for(int i = 0; i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}