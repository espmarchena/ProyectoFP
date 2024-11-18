package examen20241108;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int multiplicacion = 1;
		int suma = 0;
		int contador = 0;
		
		do {
			System.out.println("Número");
			numero = sc.nextInt();
			if (numero != 0) {
				
				if (numero % 2 == 0) {
					multiplicacion *= numero;
				} else {
					suma += numero;
				}
				
				contador++;
			}
			
			
		} while (numero != 0);
		System.out.println("Has introducido " + contador + " números");
		if (contador > 0) {
			System.out.println("El resultado de multiplicar los pares es " + multiplicacion);
			System.out.println("El resultado de sumar los impares es " + suma);
		}
		sc.close();

	}

}