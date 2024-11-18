package clases;

import java.util.Scanner;

public class VariableContador {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num;
		int contador = 0;
		
		
		do {
			
		System.out.println("Número:");
		num = sc.nextInt();
		
		System.out.println(contador);
		contador++;
		
		}
		while(num!=0 && contador<5);
		
		System.out.println("Has introducido " + contador + " números.");
		
		sc.close();
	}

}
