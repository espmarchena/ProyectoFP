package estudiandoparaelexamen1;

import java.util.Scanner;

public class CharAtCadenaWhileAlDerechoYAlReves_Repe {

	public static void main(String[] args) {
		// cadena al derecho

		System.out.println("CADENA:");
		Scanner sc = new Scanner (System.in);
		
		String s = sc.nextLine();
		int i= 0;
		
		while (i<s.length()) {
			System.out.println(s.charAt(i));
			i++;
		}
		
		
		
		// cadena al revess
		
		int a= s.length()-1;
		
		while (a>=0) {
			System.out.println(s.charAt(a));
			a--;
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
