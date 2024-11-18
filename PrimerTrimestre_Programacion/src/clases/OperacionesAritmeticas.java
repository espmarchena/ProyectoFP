package clases;

import java.util.Scanner;

public class OperacionesAritmeticas {

	public static void main (String args[]){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Numero 1");
		double numero1=sc.nextDouble();
		System.out.println("Numero 2");
		double numero2=sc.nextDouble();
		System.out.println("Numero 2");
		double numero3=sc.nextDouble();
		System.out.println("El promedio es:" + ((numero1+numero2+numero3)/3));
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("PERIMETRO CUADRADO");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("¿medida lado de un cuadrado?");
		int medida=sc.nextInt();
		
		System.out.println("El perimetro del cuadrado se calcula midiendo uno de sus lados y multiplicándolo por 4. Así que la longitud de este es igual a " + (medida*4));
		
		
		
		sc.close();
	}
}