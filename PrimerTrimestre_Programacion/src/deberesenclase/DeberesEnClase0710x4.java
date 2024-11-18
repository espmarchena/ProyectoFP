package deberesenclase;
import java.util.Scanner;
public class DeberesEnClase0710x4 {
	public static void main (String args []) {
		
		/*- Pedir un número y usando una variable booleana comprobar si el número es negativo o positivo.
		 * La variable booleana se utilizará al final para mostrar un mensaje dependiendo de si es true o false*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número:");
		
		int numero= sc.nextInt();
		
		//ternario:
		boolean negativo =numero < 0 ? true : false;
		
		System.out.println(negativo ? "Número negativo" : "Numero positivo");

		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
