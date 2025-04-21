package es.cesur.ficherosBinarios_Escritura;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraYLectura_Int {

	public static void main(String[] args) {

		try {
			/* ESCRIBIMOS EN EL FICHERO UN NÚMERO ENTERO */
			//como es binario, usamos flujo de datos de salida, FileOutputStream
			FileOutputStream fos = new FileOutputStream("numero.dat"); //creamos el fichero con este nombre dentro de la carpeta del proyecto
			
			//
			BufferedOutputStream bos = new BufferedOutputStream(fos); //No es imprescindible, podemos omitirlo, pero permite hacer mas eficiente el funcionamiento porque permite escribir linea a linea

			DataOutputStream dos = new DataOutputStream(bos); //imprescindible para escribir el int (tipo de dato primitivo)

			dos.writeInt(123456); // .writeInt() es el metodo que proporciona la clase DataOutputStream, para escribir en el fichero

			//cerramos los recursos abiertos, en orden inverso
			dos.close();
			bos.close();
			fos.close();

			System.out.println("Fichero generado correctamente");

			/* LEEMOS DEL FICHERO EL NÚMERO ESCRITO. AQUÍ YA DEBE ESTAR CREADO */
			//para leer es flujo de entrada (input) 
			FileInputStream fis = new FileInputStream("numero.dat");
			BufferedInputStream bis = new BufferedInputStream(fis); // no imprescindible para leer del fichero pero permite que el programa sea mas eficiente porque lee linea a linea

			DataInputStream dis = new DataInputStream(bis); // imprescindible para leer el int (tipo de dato primitivo)

			System.out.println("El número entero escrito en el fichero binario es: " + dis.readInt());
																					//.readInt() es el metodo que proporciona la clase DataInputStream, para leer el fichero
			
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
