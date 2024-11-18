package deberesenclase;
import java.util.Scanner;
public class PedirTextoYDarLongitudYPosicion0710 {
	public static void main (String args []) {
		
		/*- Pedir por pantalla un texto y decir la longitud, el carácter en la primera posición y el carácter de la última posición */
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Cadena de texto:");
		String cadena=sc.nextLine();
		
		System.out.println("Longitud: " + cadena.length());
		
		System.out.println("Primer carácter: " + cadena.charAt(0));
		
		System.out.println("Último carácter: " + cadena.charAt(cadena.length()-1)); // int longitud= cadena.length(); longitud -1
	
		sc.close();
	
		System.out.println("---------------------------------------------");
		
		
		/*- Pedir un texto, comprobar si el texto es de longitud > 0. En caso de que lo sea, solicitar una posición y comprobar si la posición es mayor o igual a la longitud del texto.
		 * Si es correcto, mostrar en pantalla el carácter de la posición introducida*/
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Cadena de texto:");
		String cadenatexto=teclado.nextLine();
		
		if (cadenatexto.length() >0) {
		
			System.out.println("Posición (desde 0 hasta " + (cadenatexto.length()-1) + "):");
		}
		else { 
			System.out.println("La cadena introducida no tiene carácteres:");
		}
		
		
		teclado.close();	
			
		
		
	}
	
}
