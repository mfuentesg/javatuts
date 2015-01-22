public class Ejemplo02 {

	private int vector[];

	public Ejemplo02(int vector[]) {
		this.vector = vector;
	}

	public void ordenarAsc() {
		for (int i = 0; i<vector.length; i++) {
			for (int j = 0; j<vector.length; j++) {
				if(vector[i] < vector[j]) {
					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}

	public void ordenarDesc() {
		for (int i = 0; i<vector.length; i++) {
			for (int j = 0; j<vector.length; j++) {
				if(vector[i] > vector[j]) {
					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}

	public void mostrar() {
		System.out.println("Vector ordenado");
		for (int i : vector) {
			System.out.println(i);
		}
	}
}