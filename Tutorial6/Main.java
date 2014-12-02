/**
* @author Marcelo Fuentes
**/

public class Main {
	public static void main(String[] args) {
		int edad = 18;

		if ( edad >= 18 ){
			System.out.println("Hola bienvenido");
		}else if( edad < 18 && edad > 0){
			System.out.println("Hola no puedes ser saludado");
		}

		/**
		* Ciclos
		* for, while, do-while
		*/

		//ciclo for
		System.out.println("Ciclo For");
		for(int i = 1; i<11 ; i++){
			System.out.println(i);
		}

		//ciclo while
		System.out.println("Ciclo while");
		int j = 1;
		while(j < 11){
			System.out.println(j++);
		}

		//ciclo do-while
		System.out.println("Ciclo do-while");
		int w = 1;
		do {
			System.out.println(w++);
		}while(w < 11);

	}
}