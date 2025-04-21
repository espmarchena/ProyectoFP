package es.cesur.Ficheros.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class ContarPalabra_10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el nombre del fichero: ");
		String nombreFichero = sc.nextLine();

		System.out.print("Introduce la palabra: ");
		String palabra = sc.nextLine();

		boolean encontrada = false;
		int lineaNum = 1;
		int contador = 0;

		try {
			FileReader fr =	new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			
			String linea;

			while ((linea = br.readLine()) != null) {
				if (linea.contains(palabra)) {
					encontrada = true;
					System.out.println("Palabra encontrada en la línea " + lineaNum);
					contador++;
				}
				lineaNum++;

			}

			if (!encontrada) {
				System.out.println("La palabra no fue encontrada en el fichero.");
			}
			
			sc.close();
			br.close();
			fr.close();
			
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}

		System.out.println("La palabra está: " + contador + " veces");
	}
}