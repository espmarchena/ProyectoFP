package estudiandoparaelexamen1;

import java.util.Scanner;

public class DoWhileNum0 {
	public static void main (String args[]) {
	//Pedir numeros hasta el 0
		
		Scanner sc = new Scanner (System.in);
		int numero; //declaro numero sin inicializar
		int i = 0; //declaro contador
		
		do {
			System.out.println("Dime numero");
			numero = sc.nextInt(); // inicializo numero
			
			
		}
		while (numero!=0);
		System.out.println("Fin del programa!");
		
		
		sc.close();
		
		
		
	}
	
}
