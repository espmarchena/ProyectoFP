package deberesenclase;

import java.util.Scanner;

public class DeberesEnClaseBucles0810DoWhile {

	public static void main(String[] args) { //pedir cadena texto e imprimirla con intro letra por letra
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Dame una cadena de texto:");
		String s= sc.nextLine();
		int posicion = 0;
		
		if (s.length() >0) {  //ponemos esto para que no casque a la primera si se introduce una cadena que no tenga nada.
			
		do {
			
		
			System.out.println(s.charAt(posicion));
			posicion++;
			
		}
		while(posicion<s.length());
			
		System.out.println("Cadena de texto: " + s);
		
		}
		sc.close();
	}

}



//*System.out.println("Longitud: " + cadena.length());
//System.out.println("Último carácter: " + cadena.charAt(cadena.length()-1));