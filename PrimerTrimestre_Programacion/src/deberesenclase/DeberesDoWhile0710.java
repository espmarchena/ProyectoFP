package deberesenclase;

import java.util.Scanner;

public class DeberesDoWhile0710 {
	public static void main (String args[]) {
		
		// pedir un número y si no es igual a 0 volverlo a pedir hasta que lo sea:
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
	do {
		System.out.println("Número:");
		num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("Número igual a 0");
		}
		else {
			System.out.println("Número no igual a 0");
			}	
		}
		while(num!=0);
		
		
		sc.close();
		
		
	}
}
