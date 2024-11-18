package deberesenclase;
import java.util.Scanner;
public class DeberesEnClase0710x2 {
	public static void main (String args []) {
	

		/*- Pedir un texto, comprobar si el texto es de longitud > 0. En caso de que lo sea, solicitar una posición y comprobar si la posición es mayor o igual a la longitud del texto.
		 * Si es correcto, mostrar en pantalla el carácter de la posición introducida*/
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Cadena de texto:");
		String cadena=sc.nextLine();
		
		int longitud = cadena.length();
		if (longitud>0){ //if (cadena.length() >0) {
		
			System.out.println("Posición (desde 0 hasta " + (cadena.length()-1) + "):");
			
			int posicion = sc.nextInt();
			
			if (posicion >= 0 && posicion < longitud) {
				
				System.out.println("El carácter en la posición " + posicion + " es " + cadena.charAt(posicion));
			}
			
		}
		else { 
			System.out.println("Ha introducido una posición no válida");
		}
		
		
		sc.close();	
	
	
	
	}
}
