package clases;

import java.util.Scanner;

public class DosNumerosCondicional {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in); //abre flujo de comunicación entre el teclado y el usuario
		
		
		/*System.out.println("Número 1:");
		int n1 =teclado.nextInt(); //significa que el programa introduce el numero que pone el teclado
		System.out.println("Número 2:");
		int n2 =teclado.nextInt(); //significa que el programa introduce el numero que pone el teclado
		
		if(n1>n2) {
			System.out.println("a>b");	
		}
		else { //en este caso entran menores e iguales
			System.out.println("a<b");
		}
		
		
		
		
		System.out.println("-----------------IF ANIDADOS:--------------");
		
		
		
		
		System.out.println("Número 1:");
		int num1 =teclado.nextInt(); //significa que el programa introduce el numero que pone el teclado
		System.out.println("Número 2:");
		int num2 =teclado.nextInt(); //significa que el programa introduce el numero que pone el teclado
		
		if(num1>num2) {
			System.out.println("a>b");	
		}
		else { //en este caso entran menores e iguales
			System.out.println("a<b");
			if(num1<num2) {
			}
			else { // en este caso entran solo los iguales
				System.out.println("a=b");
			}
			teclado.close();
		}
	
		
		
	/*ESTO NO ES OPTIMO:	
		if(num1>num2) {
			System.out.println("a>b");
		}
		if(num1<num2) {
			System.out.println("a<b");
		}	
		if(num1=num2) {
			System.out.println("a=b");
		}*/
		
		

	
		System.out.println("-------------------------------");
		System.out.println("Dime un número de una cifra:");
		int num =teclado.nextInt();
		
		if(num==1) {
			System.out.println("suma");
		}
		
		teclado.close();
	}
}

