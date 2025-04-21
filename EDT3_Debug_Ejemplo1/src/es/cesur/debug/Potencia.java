package es.cesur.debug;

import java.io.IOException;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) throws IOException {

		Scanner lectura = new Scanner(System.in);
		
		int base, exp, i;
		int resultado = 1;

		System.out.println("Indicar el valor de la base:");
		base = lectura.nextInt();

		System.out.println("Indicar el valor del exponente:");
		exp = lectura.nextInt();

		lectura.close();

		for (i = 1; i <= exp; i++) {
			resultado = resultado * base;
		}
		System.out.println("El número " + base + " elevado a " + exp + " es igual a " + resultado);
	}
}