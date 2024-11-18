package deberesenclase;

import java.util.Scanner;

public class DeberesEnClaseBucles0810While {

	public static void main(String[] args) { //pedir cadena texto e imprimirla con intro letra por letra
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Dame una cadena de texto:");
		String s= sc.nextLine();
		int posicion = 0;
		
		while(posicion<s.length()) {
			
			
			System.out.println("Cadena de texto: " + s);
			
			
			System.out.println(s.charAt(posicion));
			posicion++;
			
		}
		
		sc.close();
	}

}



//*System.out.println("Longitud: " + cadena.length());
//System.out.println("Último carácter: " + cadena.charAt(cadena.length()-1));