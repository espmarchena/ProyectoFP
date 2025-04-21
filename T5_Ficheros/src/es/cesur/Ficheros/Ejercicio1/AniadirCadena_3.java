package es.cesur.Ficheros.Ejercicio1;

import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class AniadirCadena_3 {
	/*3. Añadir Cadena - Realizar un programa en JAVA que lea una cadena por teclado y 
	la añada al contenido del fichero de texto “mensaje.txt”. Realizar la prueba 
	ejecutando de nuevo el ejercicio Leer Cadena. Usar el mismo paquete que en el 
	anterior ejercicio.*/

	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("mensaje.txt", true); //respeta lo que tenga el fichero y añade un segundo mensaje. No lo machaca

			BufferedWriter bw = new BufferedWriter(fr);

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce segunda cadena:");
			String mensaje = sc.nextLine();
			
			bw.newLine(); // lo pongo antes tb para que no escriba a continuacion sino en una linea nueva
			bw.write(mensaje); //permite escribir a continuacion de lo que haya en el fichero que se le indica en el FileWriter lo que contenga la variable que le pasamos por parametro // el metodo write no hace salto de linea como lo hace el println
			bw.newLine(); // este metodo solo te hace salto de linea. Usar estos dos es lo mismo que usar solamente el println
			
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