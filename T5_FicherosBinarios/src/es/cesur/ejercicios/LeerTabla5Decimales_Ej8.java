package es.cesur.ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeerTabla5Decimales_Ej8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el nombre del fichero: ");
		String nombreFichero = scanner.nextLine();

		try (FileInputStream fis = new FileInputStream(nombreFichero); DataInputStream dis = new DataInputStream(fis)) {
			System.out.println("Contenido de la tabla:");
			for (int i = 0; i < 5; i++) {
				double num = dis.readDouble();
				System.out.println("Elemento " + (i + 1) + ": " + num);
			}
		} catch (IOException e) {
			System.err.println("Error al leer el fichero: " + e.getMessage());
		}
	}
}
