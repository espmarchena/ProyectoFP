package es.cesur.Ficheros.Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Concatenar {
	
	public static void main(String[] args) throws IOException {
		
		// Teclado
		Scanner sc = new Scanner(System.in);
		
		// Ficheros
		String fichero1 = "";
		FileWriter fw1;
		BufferedWriter bw1;
//		PrintWriter salida1;
		
		String fichero2 = "";
		FileReader fr2;
		BufferedReader br2;
		// Cadena para guardar líneas del fichero2
		String lineaFichero2;
		
		// Pedir nombre fichero1
		System.out.println("Indicar el nombre del primer fichero:");
		fichero1 = sc.nextLine();
		
		// Pedir nombre fichero2
		System.out.println("Indicar el nombre del segundo fichero:");
		fichero2 = sc.nextLine();
		
		// Abrir el fichero1 para escribir y añadir líneas
		fw1 = new FileWriter(fichero1, true);
		bw1 = new BufferedWriter(fw1);
//		salida1 = new PrintWriter(br1);
		
		// Abrir el fichero2 para leer
		fr2 = new FileReader(fichero2);
		br2 = new BufferedReader(fr2);
		
		while((lineaFichero2 = br2.readLine()) != null) {
//			salida1.println();
//			salida1.print(lineaFichero2);
			
			System.out.println(lineaFichero2);
			bw1.newLine();
			bw1.write(lineaFichero2);
		}
		System.out.println("¡Archivo " + fichero1 + " actualizado correctamente!");
		
		// Cerrar objetos
		br2.close();
		bw1.close();
		fw1.close();
		fr2.close();
		sc.close();
	}
}