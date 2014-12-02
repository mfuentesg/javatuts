/**
* @author Marcelo Fuentes
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		/**
		*conjuncion: 'y'  &&
		*disyuncion: 'o'  ||
		*negacion:   'no' !
		*distinto:        !=
		*igual:           ==
		**/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 1, y = 3;

		// ==, !=
		if(x == y){
			System.out.println("Son iguales");
		}else if(x != y){
			System.out.println("Son distintos");
		}

		// || e  &&
		if(x > 3 && y == 1){
			System.out.println("x es igual que 3");
		}else if(x < 3 || y == 4){
			System.out.println("y es igual a 4");
		}

		if(!(x != y)){
			System.out.println("ambas variables son iguales");
		}


		//switch

		try{
			System.out.println("ingresa un valor entre 1-3: ");
			int valor = Integer.parseInt(br.readLine());
			switch (valor) {
				case 1:
					System.out.println("es un 1");
				break;
				case 2:
					System.out.println("es un 2");
				break;
				case 3:
					System.out.println("es un 3");
				break;
				default:
					System.out.println("el numero esta fuera de rango");
				break;
			}
		}catch(Exception e){

		}

	}
}