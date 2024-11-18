package estudiandoparaelexamen1;

import java.util.Scanner;

public class While_If_LongitudCadenaParImparYSalir {

	public static void main (String args[]) {
		//Pedir cadenas de texto y mostrar por pantalla si la longitud de la cadena es par o impar.
		//Salir del bucle cuando se introduzca la cadena Salir
	
		Scanner sc = new Scanner (System.in);
		String s = "";
		
		while (!s.equals("salir")){
			System.out.println("cadena de texto:");
			s = sc.nextLine();
			System.out.println("La longitud de la cadena de texto es: " + s.length());
			
			if (s.length()%2 ==0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
			
		}
		System.out.println("Fin del programa");		
				
				
		sc.close();
		
	
	
	}
	
}
