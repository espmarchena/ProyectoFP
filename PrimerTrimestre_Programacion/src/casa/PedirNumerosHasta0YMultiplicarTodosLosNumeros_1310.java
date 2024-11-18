package casa;

import java.util.Scanner;

public class PedirNumerosHasta0YMultiplicarTodosLosNumeros_1310 {

	public static void main (String args []) {
		// TODO Pedir números hasta un 0 y mostrar una vez que se sale del bucle,
		//el resultado de multiplicar todos los números introducidos
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int resultado =1;
		int contador=0;
		
		// int acumulador=1; // acumulador += valor ES LO MISMO QUE a=a+valor
		
			
		do {
			System.out.println("Dime un número:");
			num= sc.nextInt();
			
			if (!(num==0)) {
			resultado= resultado*num;
			contador++;
				
			}
		}	
		while (!(num==0));
			
		System.out.println("Se han introducido " +contador+ " números");
		System.out.println("El resultado de la multiplicación es: " + resultado);
			
			
		
		sc.close();
	}

}