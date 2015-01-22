public class Ejemplo01 {
	
	private String vector[];

	public Ejemplo01(String vector[]) {
		this.vector = vector;
	}


	public void ordenar() {
		for (int i = 0; i<vector.length; i++) {
			for (int j = 0; j<vector.length && i != j; j++) {
				if(vector[i].compareToIgnoreCase(vector[j]) < 0) {
					String aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}

	public void mostrar() {
		for (String a : vector) {
			System.out.println(a);
		}
	}

}