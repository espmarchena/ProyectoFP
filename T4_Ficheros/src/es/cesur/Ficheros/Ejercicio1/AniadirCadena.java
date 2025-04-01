package es.cesur.Ficheros.Ejercicio1;

import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class AniadirCadena {
	/*3. Añadir Cadena - Realizar un programa en JAVA que lea una cadena por teclado y 
	la añada al contenido del fichero de texto “mensaje.txt”. Realizar la prueba 
	ejecutando de nuevo el ejercicio Leer Cadena. Usar el mismo paquete que en el 
	anterior ejercicio.*/

	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("mensaje.txt", true);

			BufferedWriter bw = new BufferedWriter(fr);

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce segunda cadena:");
			String mensaje = sc.nextLine();
			
			bw.write(mensaje); //permite escribir en el fichero lo que contenta la variable que le pasamos por parametro
			
			sc.close();
			bw.close();
			fr.close();

			System.out.println("¡Archivo creado correctamente!");
			
		} catch (IOException i) {
			System.out.println("Se produjo un error de Archivo");
			System.out.println(i.getMessage());
		}
	}
}