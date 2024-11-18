package deberesenclase;
import java.util.Scanner;
public class DeberesEnClase0710x6Bisiesto {
	public static void main (String args []) {

		/*- Pedir un año y comprobar si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, a menos que también sea divisible por 400.
		 * Usa un booleano para mostrar al final un mensaje diciendo si es bisiesto o no*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Año: ");
		int ano = sc.nextInt();
		
		boolean esBisiesto = false;	
		if ((ano % 4 ==0 && ano % 100 != 0) || ano % 400 ==0) {
			esBisiesto = true;	
		}
		if (esBisiesto) {
			System.out.println("Año bisiesto");
		}
		else {
			System.out.println("Año no bisiesto:");
		}
		
		sc.close();
	}
}
