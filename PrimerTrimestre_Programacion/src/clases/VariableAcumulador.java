package clases;

import java.util.Scanner;

public class VariableAcumulador {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num;
		int suma = 0;
		
		
		do {
			
		System.out.println("Número:");
		num = sc.nextInt();
		suma= suma + num;
		
		System.out.println("El valor total de los números introducidos es: " + suma);
		
		}
		while(suma<25);
		
		System.out.println("El valor total de los números introducidos es: " + suma + " y es mayor de 25");
		
		sc.close();
	}

}
