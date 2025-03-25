package es.cesur.FicherosTexto2;

import java.io.*;

public class FicheroTextoEscritura {
	public static void main(String[] args) {
		try // FileWriter también puede lanzar una excepción
		{
			// Destino de los datos
			FileWriter fw = new FileWriter("archivo.txt", true); //con el constructor con dos parametros, al ponerlo true, en vez de machacar el archivo, le añade mas info
			
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			
			// Guardamos la primera línea
			//salida.println("Primera línea");
			
			// Escribimos la segunda línea
			salida.println("Segunda línea");
			
			// Cerrar el objeto salida, el objeto bw y el fw
			salida.close();
			bw.close();
			fw.close();
			
			System.out.println("¡Archivo creado correctamente!");
			
		} catch (IOException i) {
			System.out.println("Se produjo un error de Archivo");
		}
	}
}