package deberesenclase;

import java.util.Scanner;

public class ImprimirCadenaTextoMientrasQueLaPalabraNoSeaSalir11_10 {

	public static void main (String args []) {
		//Imprimir la cadena de texto solicitada mientras que la palabra no sea 'salir'
		
		Scanner sc = new Scanner(System.in);
		
		String s = "hola";
		
		if (s.length() >0) {  //ponemos esto para que no casque a la primera si se introduce una cadena que no tenga nada.
		
		if (!(s.equals("salir"))) {	
			
			do {
				System.out.println("Dame una cadena de texto:");
				s= sc.nextLine();
		
				
			}
			while (!(s.equals("salir")));
			
			System.out.println(s);
			}
		}
		else {
			
		}
		
		sc.close();
	}

}