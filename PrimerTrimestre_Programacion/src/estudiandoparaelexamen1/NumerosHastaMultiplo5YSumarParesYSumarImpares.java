package estudiandoparaelexamen1;

import java.util.Scanner;

public class NumerosHastaMultiplo5YSumarParesYSumarImpares {

	public static void main(String[] args) {
		// pedir numeros hasta multiplo de 5 y sumar pares por un lado e impares por otro lado

		Scanner sc= new Scanner (System.in);
		int num=1;
		int acumuladorPar=0;
		int acumuladorImpar=0;
		
		while(!(num%5==0)) {
			System.out.println("numerito");
			num= sc.nextInt();
				
		
			if (num%2==0) {
				acumuladorPar+=num;
			}
			if (!(num%2==0)) {
				acumuladorImpar+=num;
			}
		}
		System.out.println("suma pares: " + acumuladorPar);
		System.out.println("suma impares: " + acumuladorImpar);
		
		
		
		
		
		sc.close();
	}

}
