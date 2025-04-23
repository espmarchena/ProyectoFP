package es.cesur.ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tabla5Decimales_Ej7 {

	public static void main(String[] args) {
		double[] tabla = new double[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce 5 números decimales:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			tabla[i] = scanner.nextDouble();
		}

		try (FileOutputStream fos = new FileOutputStream("tabla.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {
			for (double num : tabla) {
				dos.writeDouble(num);
			}
			System.out.println("Tabla guardada correctamente en tabla.dat");
		} catch (IOException e) {
			System.err.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}
}
