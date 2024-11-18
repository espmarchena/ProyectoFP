package deberesenclase;

import java.util.Scanner;

public class MostrarCadenaDeTextoAlReves11_10 {

	public static void main(String[] args) {

	// muestra cadena de texto al reves
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime una palabra:"); 
	String s= sc.nextLine();
	int posicion = s.length()-1; // Esta línea calcula la posición del último carácter en la cadena s.
				
	if (s.length() >0) {  //ponemos esto para que no casque a la primera si se introduce una cadena que no tenga nada.
					
	while(posicion>=0) {
					
				
		System.out.println(s.charAt(posicion));
		posicion--; // posicion=posicion-1
					
	}
				
					
	System.out.println("Cadena de texto: " + s);
				
	}
	sc.close();
				
	}

}
	