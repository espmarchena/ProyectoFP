package casa;

import java.util.Scanner;

public class DeberesEnCasa1_1310LONGITUDPARIMPAR {

	//Pedir cadenas de texto y mostrar por pantalla si la longitud de la cadena es par o impar.
	//Salir del bucle cuando se introduzca la cadena Salir
	
	public static void main (String args[]) {
		
		Scanner sc= new Scanner (System.in);
		String cadena;
		final String PALABRA_PARA_SALIR= "salir"; //declaro CONSTANTE que todo el rato tiene el mismo valor. La palabra 'final' se utiliza para declararla.
		
		do {
		
		System.out.println("Dime una palabra:");
		cadena= sc.nextLine();
		int longitud = cadena.length();
		
		if (cadena.length() >0 && !cadena.equals(PALABRA_PARA_SALIR)) {  //ponemos esto para que no casque a la primera si se introduce una cadena que no tenga nada.
															//para que no imprima nada más al escribir 'salir'
		
			if (longitud%2 == 0){
				System.out.println(longitud);
				System.out.println("longitud PAR");
			}
			else if (longitud%2 !=0){
				System.out.println(longitud);
				System.out.println("longitud IMPAR");	
			}
					
			}	
		}
			while(!cadena.equals(PALABRA_PARA_SALIR));
			
			System.out.println("adios");
			
		
		
		
		sc.close();
	}

}
