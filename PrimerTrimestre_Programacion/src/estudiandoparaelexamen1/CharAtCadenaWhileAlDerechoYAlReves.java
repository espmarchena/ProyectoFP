package estudiandoparaelexamen1;

import java.util.Scanner;

public class CharAtCadenaWhileAlDerechoYAlReves {

	public static void main(String[] args) {
		
		// bucle para sacar cada letra de una cadena de texto
		
		System.out.println("Cadena texto");
		Scanner sc = new Scanner (System.in);
		String cadena = sc.nextLine();
		
		int i = 0;
		
		if (i>=0) {
		
			while(i<cadena.length()) {
			
				System.out.println(cadena.charAt(i++));
	
			}

		}
			
		// bucle para sacar cada letra de una cadena de texto al revés	
		
		System.out.println("Cadena texto");
		cadena = sc.nextLine();
		
		int posicion = cadena.length()-1;  // Inicializa la variable 'posicion' con el índice del último carácter de la cadena
		
		if (posicion>=0) { // Comprueba si 'posicion' es mayor o igual a 0, lo cual es cierto si la cadena no está vacía. O sea controlamos que no casque a la primera si se introduce una cadena que no tenga nada.
		
			while(posicion>=0) {
				
				System.out.println(cadena.charAt(posicion--)); // Imprime el carácter en la posición actual de 'cadena' y luego decrementa 'posicion' en 1.
			}	
		}
		
		
		
		
			sc.close();
	}

}
