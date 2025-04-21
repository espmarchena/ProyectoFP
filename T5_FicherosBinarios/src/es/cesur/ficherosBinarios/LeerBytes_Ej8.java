package es.cesur.ficherosBinarios;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerBytes_Ej8 {
	
	public static void main(String[] args) {
		
		String archivo = "bytes.dat";

		try {

			FileInputStream fis = new FileInputStream(archivo); // para leer los bytes del fichero indicando en el parametro del constructor el fichero que vamos a leer

			int byteLeido;

			System.out.print("Contenido del archivo: ");
			System.out.println();

			while ((byteLeido = fis.read()) != -1) { //leemos todos los bytes y los guardamos en variable que mas arriba hemos declarado de tipo int
				System.out.print(byteLeido + " "); // para ver la diferencia sin castear
				System.out.print((char) byteLeido + " "); // Casteamos y convertimos cada byte de la variable de tipo int a char (caracter)
			}

			fis.close();

			System.out.println(); // salto de línea al final
			
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
