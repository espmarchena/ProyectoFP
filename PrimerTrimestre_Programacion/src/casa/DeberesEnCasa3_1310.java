package casa;
import java.util.Scanner;
public class DeberesEnCasa3_1310 {

	public static void main (String args []) {
	
	//- Pedir una cadena de texto y convertir todas las mayúsculas de la cadena a su minúscula .
	//Para comprobar si una letra es mayúscula comprobad que el carácter está entre 'A' y 'Z' y los cambiáis sumándole a ese carácter 32.	
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Cadena:");
		String cadena= sc.nextLine();
		String nuevaCadena= " ";
		int posicion=0;
		
		do {
			char c= cadena.charAt(posicion);
			
			if (c>='A' && c<='Z' || c=='Ñ') { //para que controle tb la 'Ñ', y tb se podría poner igual para las tildes Á,É,Í,Ó,Ú
				c= (char)(c+32);  //c+=32 ES LO MISMO
			}
			nuevaCadena+=c;  //nuevaCadena= nuevaCadena+c;
			//acumulo la cadena de texto
			
			posicion++;
		}
		while(posicion<cadena.length());
		
		System.out.println("Convierto a minúsculas: " + nuevaCadena);
		
		
		
		
		sc.close();
	}
}
