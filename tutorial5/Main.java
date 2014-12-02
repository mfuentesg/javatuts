/**
* @author Marcelo Fuentes
**/

public class Main {
	public static void main(String[] args) {
		int a[] = new int [4];
		int [] b = new int [4];
		int [] c = {1,2,3,4};

		a[ 0 ] = 1;
		a[ 1 ] = 2;
		a[ 2 ] = 3;
		a[ 3 ] = 4;

		mostrar(a, 2);

		int w = 3;
		w = w + 3; 
		// o podriamos utilizar
		w += 3;
		w = w - 3;
		w -= 3;
		//puede ser utilizado para cada caso +, -, *, /

		++w; //preincremento
		w++; //postincremento
		--w;
		w--;

		System.out.println(w++);
		System.out.println(++w);
		System.out.println(w--);
		System.out.println(--w);
	}

	public static void mostrar(int vector[], int pos){
		System.out.println(vector[pos]);
	}
}