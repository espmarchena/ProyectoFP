package es.cesur.Ficheros.Ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el nombre del primer fichero:");
		String fichero1 = sc.nextLine();
		
		System.out.println("Indica el nombre del segundo fichero:");
		String fichero2 = sc.nextLine();
		
		try {
			Concatenar2.concatenar(fichero1, fichero2);	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
