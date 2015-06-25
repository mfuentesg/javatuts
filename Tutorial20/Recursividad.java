/**
* @author Marcelo Fuentes
*/

public class Recursividad {
	public static int factorial (int w) {
		if (w <= 1) {
			return 1;
		} else {
			return w * factorial(w-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
}