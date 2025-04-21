package es.cesur.FicherosTexto;

import java.io.*;

public class FicheroTextoEscritura {
	
	public static void main(String[] args) {
		
		// FileWriter también puede lanzar una excepción
		try { //LO QUE EL PROGRAMA INTENTA EJECUTAR. SI VA BIEN, FINALIZA. SI HAY ERROR, PASA AL CATCH.
			
			// Destino de los datos
			FileWriter fw = new FileWriter("archivo.txt"); //crear el fichero de texto y permite escribir en él, caracter a caracter (flujo de salida del programa).
			//Lo crea dentro de la carpeta del proyecto de Eclipse. Tb le podemos pasar una ruta
			//si no ponemos segundo parametro, sobreentiende que es false y machaca el archivo. Si ponemos a true el segundo paremetro no machaca sino que añade segunda linea al fichero:
			//FileWriter(File file, boolean append);
			
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw); //no se puede usar sin un FileWriter previo, ya que no crea el fichero, solo permite escribir en el fichero, linea a linea. 
			//ademas necesita que se lo pasemos por parametros en el constructor (new BufferedWriter(fw))
			
			
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw); //para darle formato a los caracteres del fichero
			//hay que pasarle el BufferedWriter por parametros en el constructor (new PrintWriter(bw))
			
			
			// Guardamos la primera línea
			// println es un metodo que tiene la clase PrintWriter. Escribe lo que le pasas por parametros, y ademas el ln introduce un salto de linea
			salida.println("Primera línea"); //abrimos el primer Stream. Esta será la frase que contenga el archivo
			
			// Cerrar el objeto salida, el objeto bw y el fw. En orden inverso a como se ha abierto
			salida.close();
			bw.close();
			fw.close();
			
			System.out.println("¡Archivo creado correctamente!");
			
		} catch (IOException i) { //CAPTURA LA EXCEPCION (ERROR) QUE SE DA AL EJECUTAR EL TRY. AQUI INDICA EXCEPCION DE ENTRADA/SALIDA
			System.out.println("Se produjo un error de Archivo");
			System.out.println(i.getMessage()); // con el objeto que se genera en el IOExcepcion (aqui se llama i), usamos este metodo que te proporciona el mensaje de error, para orientarnos a lo que esta sucediendo
		}
	}
}