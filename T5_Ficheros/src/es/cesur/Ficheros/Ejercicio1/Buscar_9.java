package es.cesur.Ficheros.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Buscar_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el nombre del fichero: ");
		String nombreFichero = sc.nextLine();
		System.out.print("Introduce la palabra: ");
		String palabra = sc.nextLine();

		boolean encontrada = false;
		int lineaNum = 1; // Contador para llevar el número de línea actual

		// 1. Intenta abrir y leer el archivo
		// 2. Crea una cadena de lectores:
		// - FileReader: abre el archivo en modo lectura
		// - BufferedReader: permite leer línea por línea eficientemente
		// 3. El paréntesis después de try indica que estos recursos se cerrarán
		// automáticamente al terminar el bloque, incluso si ocurre una excepción
		try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

			String linea;// Variable para almacenar cada línea leída

			// Bucle para leer cada línea del fichero
			while ((linea = br.readLine()) != null) {

				// Bucle externo: recorre la línea carácter por carácter
				// linea.length(): Longitud total de la línea actual
				// palabra.length(): Longitud de la palabra buscada
				// Resta: Calcula la última posición válida donde podría comenzar la palabra
				// Ejemplo: Si línea tiene 10 caracteres y palabra tiene 3:
				// 10 - 3 = 7 (última posición inicial posible: caracteres 7,8,9)
				for (int i = 0; i <= linea.length() - palabra.length(); i++) {
					boolean coincide = true; // Suponemos que hay coincidencia inicialmente

					// Bucle interno: compara cada carácter de la palabra
					for (int j = 0; j < palabra.length(); j++) {
						// Si algún carácter no coincide, marcamos como false
						if (linea.charAt(i + j) != palabra.charAt(j)) {
							coincide = false;
							break;
						}
					} // Si todos los caracteres coincidieron
					if (coincide) {
						encontrada = true; // Marcamos como encontrada
						System.out.println("Palabra encontrada en la línea " + lineaNum);
						break; // Salimos del bucle externo para esta línea
					}
				}
				lineaNum++;// Incrementamos el contador de líneas
			}

			// Si terminamos de leer el archivo y no encontramos la palabra
			if (!encontrada) {
				System.out.println("La palabra no fue encontrada en el fichero.");
			}

		} catch (IOException e) {
			// Manejo de errores al leer el fichero
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
	}
}