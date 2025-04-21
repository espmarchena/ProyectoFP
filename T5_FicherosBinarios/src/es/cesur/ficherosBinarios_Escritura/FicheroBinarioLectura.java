package es.cesur.ficherosBinarios_Escritura;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroBinarioLectura {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("datos.dat"); //Tiene que existir el fichero. Con el FileInputStream podemos leer byte a byte la informacion del fichero
			
			BufferedInputStream bis = new BufferedInputStream(fis); //leeremos linea a linea lo que hay en el fichero
			
			// Necesitamos un objeto de la clase DataInputStream. Lee el tipo de dato primitivo que contiene el fichero
			DataInputStream entradaB = new DataInputStream(bis);
			
			// Sacar un double del archivo binario con .readDouble()
			System.out.println(entradaB.readDouble());
			
			//cerramos los recursos abiertos, en orden inverso
			entradaB.close();
			bis.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo NO encontrado");
			
		} catch (IOException i) {
			System.out.println("Se produjo un error de Archivo");
		}
	}
}
