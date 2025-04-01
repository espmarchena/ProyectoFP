package es.cesur.Ficheros.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class LeerCadena {
	/*2. Leer Cadena - Realizar un programa en JAVA que muestre por pantalla el 
	contenido del fichero de texto “mensaje.txt”. Usar el mismo paquete y el mismo 
	fichero de texto que en el ejercicio anterior.*/
	
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("mensaje.txt"); //crea el fichero y escribe en el 		
			BufferedReader br = new BufferedReader (fr);		
			
			String s;
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
			br.close();
			fr.close();
			

		}
		catch (FileNotFoundException e) {
			e.printStackTrace(); // metodo que tiene la excepcion que da informacion del error si falla el try

		}
		catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		

	}

}
