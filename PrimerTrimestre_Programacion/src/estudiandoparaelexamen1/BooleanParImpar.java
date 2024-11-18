package estudiandoparaelexamen1;

import java.util.Scanner;

public class BooleanParImpar {

	public static void main(String[] args) {
		//Crea un programa que determine si un número entero introducido por el usuario es par o impar
		//Usa booleans

		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número y te diré si es par o impar");
		int num = sc.nextInt();
		
		boolean esPar = num%2 ==0;
		
		if (esPar) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar.");
		}
		
		
		sc.close();
		
	}

}
