package es.cesur.Ficheros.Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Asterisco_4 {

	public static void main(String[] args) {
		/*
		 * 4. Asterisco - Realizar un programa en JAVA que lea caracteres por teclado
		 * hasta escribir un ‘*’. Guardar todos los caracteres pulsados en el fichero “fich2.txt”.
		 */
		Scanner sc = new Scanner(System.in);

		try {
			FileWriter fw = new FileWriter("fich2.txt"); // crea el fichero y escribe en el
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);

			String s = null;

			do { // con while solamente, el asterisco tb te lo introduce en el fichero
				System.out.println("Introduce cadena: (pulsa * para finalizar)");
				s = sc.nextLine();

				if (!s.equals("*")) {
					salida.println(s);
				}

			} while (!s.equals("*"));
			System.out.println(s);

			// cerrar objetos
			salida.close();
			bw.close();
			fw.close();
			sc.close();

			System.out.println("¡Archivo creado correctamente!");

		} catch (FileNotFoundException e) {
			e.printStackTrace(); // metodo que tiene la excepcion que da informacion del error si falla el try

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

	}

}
