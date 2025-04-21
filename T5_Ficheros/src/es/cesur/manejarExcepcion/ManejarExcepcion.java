package es.cesur.manejarExcepcion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejarExcepcion {

	public static void manejarExcepcion() throws IOException { // propagando la excepcion para que otro metodo en otra parte los programa lo capture

		// Destino de los datos
		FileWriter fw = new FileWriter("archivo.txt"); 
	

		// Buffer de escritura
		BufferedWriter bw = new BufferedWriter(fw); 

		// Objeto para la escritura
		PrintWriter salida = new PrintWriter(bw);


		// Guardamos la primera línea
		salida.println("Primera línea");

		// Cerrar el objeto salida, el objeto bw y el fw. En orden inverso a como se ha abierto
		salida.close();
		bw.close();
		fw.close();

		System.out.println("¡Archivo creado correctamente!");

	}
}
