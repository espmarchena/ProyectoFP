package es.cesur.FicherosTextoLectura;

//El paquete java.io posee las clases necesarias para los archivos 
import java.io.*;

public class FicheroTextoLectura {
	
	public static void main(String[] args) {
		//Como usaremos FileReader y puede lanzar una excepción necesitaremos un bloque try – catch 
		
		try { //INTENTA EL CODIGO. SI SE PRODUCE ERROR SE VA AL CATCH, DEPENDIENDO DE LA EXCEPCION QUE DE 
			// Origen de los datos en el proyecto anterior
			FileReader fr = new FileReader("archivo.txt");
			
			// Buffer de lectura
			BufferedReader entrada = new BufferedReader(fr); //lectura mas eficiente ya que va linea a linea, y no caracter a caracter como el FileReader
			
			String s; // la info que vamos a leer del fichero estara guardada en esta variable de tipo string
			
			// Bucle para sacar la información del archivo, que va leyendo todas las lineas:
			while ((s = entrada.readLine()) != null) { //mientras el metodo devuelva algo distinto de null significa que el fichero tiene lineas nuevas para leer
				System.out.println(s);
			}
			
			// Cerrar el objeto entrada y fr. Siempre en orden inverso a como se han abierto
			entrada.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo NO encontrado");
			System.out.println(e.getMessage()); // nos da la info con un mensaje sobre la excepcion que se ha producido
			
		} catch (IOException i) {
			System.out.println("Se produjo un error de Archivo");
			System.out.println(i.getMessage()); // nos da la info con un mensaje sobre la excepcion que se ha producido
		}
	}
}
