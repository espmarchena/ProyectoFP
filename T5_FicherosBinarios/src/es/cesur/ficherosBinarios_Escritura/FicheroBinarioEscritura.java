package es.cesur.ficherosBinarios_Escritura;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBinarioEscritura {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("datos.dat"); //escribe byte a byte
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// Necesitamos un objeto de la clase DataOutputStream. Nos permite escribir tipos de datos primitivos (int, double, float....)
			DataOutputStream salidaB = new DataOutputStream(bos);
			
			// Escribir un double en el archivo
			salidaB.writeDouble(7.345);
			//.writeInt(7) //.writeFloat()
			
			//cerrar los recursos que se han abierto en orden inverso:
			salidaB.close();
			bos.close();
			fos.close();
			
			System.out.println("¡Archivo creado correctamente!");
			
		} catch (IOException i) {
			System.out.println("Se produjo un error de Archivo");
		}
	}
}
