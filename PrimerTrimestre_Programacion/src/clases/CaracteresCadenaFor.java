package clases;

import java.util.Scanner;

public class CaracteresCadenaFor {
	
	public static void main (String args []) {
		
		//Pide cadena texto e imprime las letras de una en una hacia abajo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadena de texto:");
		String cadena= sc.nextLine();
		
		/*for (int posicion=0; posicion<cadena.length() ;posicion++) {
			System.out.println(cadena.charAt(posicion));
			
		}
		*/
		
		//Pide cadena texto e imprime las letras hacia abajo pero del reves
		
		for (int posicion=cadena.length()-1; posicion>=0 ;posicion--) {
			System.out.println(cadena.charAt(posicion));
		
		
		}
		sc.close(); 
		
	}
}
