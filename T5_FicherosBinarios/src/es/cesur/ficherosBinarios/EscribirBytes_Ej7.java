package es.cesur.ficherosBinarios;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirBytes_Ej7 {

	public static void main(String[] args) {

		String archivo = "bytes.dat"; //Datos que vamos a escribir (convertidos a bytes)
		//El código ASCII de estos caracteres son los que tenemos en el array
		 
		// array de bytes
		byte[] datos = { 65, 66, 67, 68, 69 }; // mostrará A, B, C, D, E

		try {
			FileOutputStream fos = new FileOutputStream(archivo);
			fos.write(datos);

			fos.close();

			System.out.println("Datos escritos correctamente en " + archivo);
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}
}
