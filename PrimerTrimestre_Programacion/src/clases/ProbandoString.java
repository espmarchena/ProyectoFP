package clases;
import java.util.Scanner;
public class ProbandoString {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
	
		System.out.println("CADENA CARACTERES");
		String s= teclado.nextLine();
		
		//
		if (s.equals("HOLA")) {
			System.out.println("HE ESCRITO HOLA");
		}
		else {
			System.out.println("NO HE ESCRITO HOLA");
		}
		
		System.out.println("----------------------------------");
		
		//
		String s1 = "Hola"; //la variable del string se llama objeto pq es de una clase (string) y no de un tipo basico (int)
		String s2 = "Hola";
		if (s1.equals(s2)) { // if("hola".equals("hola)) { también se puede hacer
			System.out.println("igualito");
		}
		
		System.out.println("----------------------------------");
		
		//
		System.out.println("CADENA CARACTERES");
		String ss= teclado.nextLine();
		int longitud=ss.length();
		System.out.println("La longitud de la cadena de texto es de:" + longitud);
		
		/* if(s1.length()==1) {
		} */
		
		
		teclado.close();
		
	}	
}
