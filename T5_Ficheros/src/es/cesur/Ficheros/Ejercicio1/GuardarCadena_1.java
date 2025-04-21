package es.cesur.Ficheros.Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarCadena_1 {
	/*1. Guardar Cadena - Realizar un programa en JAVA que lea una cadena por teclado 
	y la guarde en el fichero de texto “mensaje.txt”. */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un mensaje:");
		String mensaje = sc.nextLine();
		
		//file f = new File (../T4_Ficheros/src/es/cesur/Ficheros/Ejercicio1/mensaje.txt;
		
		try {
			FileWriter fw = new FileWriter("mensaje.txt"); //crea el fichero y escribe en el 		
			BufferedWriter bw = new BufferedWriter(fw);		
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(mensaje);
			
			pw.close();
			bw.close();
			fw.close();
			sc.close();
			
			System.out.println("¡Archivo creado correctamente!");
			
		}
		catch (IOException e) {
			e.printStackTrace(); // metodo que tiene la excepcion que da informacion del error si falla el try
			System.out.println("Error");
			
		}

	}

}
