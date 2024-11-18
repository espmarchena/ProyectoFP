package deberesenclase;

import java.util.Scanner;

public class DeberesEnClaseBucles0810x2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		//pedir numeros hasta el 0 y por cada numero que introduces tiene que decir si es par o impar y luego contar pares e impares.
		
		int num = 0;
		int contadorPar = 0;
		int contadorImpar = 0;
		int suma = 0;
		
		do {
			System.out.println("Número:");
			num=sc.nextInt();
			suma=suma+num;
			
			if(num % 2==0 && num !=0) {
				System.out.println("Número par");
				contadorPar++;
			}
			else if(num==0) {
				System.out.println("Número 0");
			}
			else {
				System.out.println("Número impar");
				contadorImpar++;
			}
			
			System.out.println("Has introducido " + contadorPar + " números pares.");
		
			System.out.println("Has introducido " + contadorImpar + " números impares.");
		
			
			System.out.println("La suma de los números introducidos es: " + suma);
		}
		while(num!=0);
		
		sc.close();
	}

}
