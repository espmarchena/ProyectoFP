package deberesenclase;

import java.util.Scanner;

public class ImprimirCaracteresDeUnaCadenaHastaUnoConcreto11_10 {

	public static void main(String[] args) { //imprime los caracteres de una cadena de texto hasta que introduzca una 'A'
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Dame una cadena de texto:");
		String s= sc.nextLine();
		int posicion = 0;
		char A= 0;
		
		if (s.length() >0) {  //ponemos esto para que no casque a la primera si se introduce una cadena que no tenga nada.
			
		while(A!=65) {
			
			A= s.charAt(posicion);
			if (A!=65) {
				System.out.println(A);
				posicion++;
			}
		}
	
		}
		sc.close();
	}

}