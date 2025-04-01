package es.cesur.Ficheros.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		/*5. Comparar - Realizar un programa en JAVA que lea el nombre de dos ficheros de 
		texto y nos diga si los ficheros son iguales o no. Nos referimos al contenido de los ficheros. */
		
	
		Scanner sc = new Scanner(System.in);
		String fichero1 = "";
		String fichero2 = "";
		
		try {
			System.out.println("Indica el nombre del primer fichero:");
			fichero1 = sc.nextLine();
			
			System.out.println("Indica el nombre del segundo fichero:");
			fichero2 = sc.nextLine();
			
			FileReader fr1 = new FileReader(fichero1);
			FileReader fr2 = new FileReader(fichero2);
			
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			
			String cadena, contenido1 = "", contenido2 = "";
			
			while((cadena = br1.readLine()) != null) {
				contenido1 = contenido1 + cadena;
			}
			
			while((cadena = br2.readLine()) != null) {
				contenido2 = contenido2 + cadena;
			}
			
			br2.close();
			br1.close();
			fr2.close();
			fr1.close();
			sc.close();
			
			System.out.println(contenido1);
			System.out.println(contenido2);
			
			if(contenido1.equals(contenido2)) {
				System.out.println("El contenido del fichero 1: " + fichero1 + " y el fichero 2: " + fichero2 + " es igual");
			}
			else {
				System.out.println("El contenido del fichero 1: " + fichero1 + " y el fichero 2: " + fichero2 + " es diferente");
			}
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException i) {
			System.out.println("Se produjo un error en el archivo");
			System.out.println(i.getMessage());
		}
		
	}

}
