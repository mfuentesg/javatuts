/**
* @author Marcelo Fuentes
**/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingresa el primer número: ");
			int a = Integer.parseInt(in.readLine());
			System.out.println("Ingresa el segundo número: ");
			int b = Integer.parseInt(in.readLine());
			System.out.println("La suma es: "+sumar(a,b));
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}

	public static int sumar(int a, int b){
		return a+b;
	}
}