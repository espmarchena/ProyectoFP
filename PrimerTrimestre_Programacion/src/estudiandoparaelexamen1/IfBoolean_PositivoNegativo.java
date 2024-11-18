package estudiandoparaelexamen1;

import java.util.Scanner;

public class IfBoolean_PositivoNegativo {

	public static void main (String args[]) {
	/*Pedir un número y usando una variable booleana comprobar si el número es negativo o positivo.
	La variable booleana se utilizará al final para mostrar un mensaje dependiendo de si es true o false*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Número:");
		int numero = sc.nextInt();
		
		boolean esPositivo = numero>=0;
		
		if(esPositivo) {
			System.out.println("++++");
		}
		else {
			System.out.println("----");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
