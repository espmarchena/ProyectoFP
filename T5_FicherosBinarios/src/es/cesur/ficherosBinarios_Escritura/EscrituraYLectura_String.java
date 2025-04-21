package es.cesur.ficherosBinarios_Escritura;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraYLectura_String {

	public static void main(String[] args) {

		try {
			/* ESCRIBIMOS EN EL FICHERO UN STRING (CADENA DE TEXTO) */
			FileOutputStream fos = new FileOutputStream("cadena.dat"); // creamos el fichero en el proyecto 
			
			BufferedOutputStream bos = new BufferedOutputStream(fos); //para leer linea a linea

			DataOutputStream dos = new DataOutputStream(bos); //usamos este metodo para leer el primitivo del fichero

			dos.writeUTF("Hola, buenos días");// String codificado en UTF. Permite escribir una cadena de caracteres que pases como parametro por el constructor, en el fichero binario

			//cerramos los recursos abiertos, en orden inverso
			dos.close();
			bos.close();
			fos.close();

			System.out.println("Fichero generado correctamente");

			/* LEEMOS DEL FICHERO EL STRING (CADENA DE CARACTERES) ESCRITO */
			FileInputStream fis = new FileInputStream("cadena.dat"); //para leer el fichero binario, indicando su nombre
			BufferedInputStream bis = new BufferedInputStream(fis); // leemos linea a linea

			DataInputStream dis = new DataInputStream(bis); //para leer del fichero

			System.out.println("La cadena escrita en el fichero binario es: " + dis.readUTF());
																				//Permite leer la cadena de texto
			
			//cerramos los recursos abiertos, en orden inverso
			dis.close();
			bis.close();
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (IOException i) {
			System.out.println(i.getMessage());
			i.printStackTrace();
		}
	}
}
