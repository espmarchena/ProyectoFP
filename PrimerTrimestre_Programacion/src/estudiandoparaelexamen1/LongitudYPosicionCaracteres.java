package estudiandoparaelexamen1;

import java.util.Scanner;

public class LongitudYPosicionCaracteres {
	public static void main (String args[]) {
	// Pedir por pantalla un texto y decir la longitud, el carácter en la primera posición y el carácter de la última posición	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cadena de texto:");
		String cadena =sc.nextLine();
		
		int longitud = cadena.length();
		System.out.println("Longitud cadena: "+ longitud);
		
		char primeraPosicion = cadena.charAt(0);
		char ultimaPosicion = cadena.charAt((longitud)-1); // es lo mismo: cadena.charAt(cadena.length())-1) para que me de la ultima posicion
		
		System.out.println("El caracter en la primera posicion es: " + primeraPosicion);
		System.out.println("El caracter en la ultima posicion es: " + ultimaPosicion);
	
	
	
	
	
	 sc.close();
		
		
		
		
	}
	
}
