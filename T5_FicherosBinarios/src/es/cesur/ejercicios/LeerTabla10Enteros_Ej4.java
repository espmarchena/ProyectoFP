package es.cesur.ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeerTabla10Enteros_Ej4 {

	/* 4. Leer tabla 10 enteros - Realizar un programa en JAVA que muestre el contenido 
	(tabla de 10 enteros, de uno en uno) del fichero binario cuyo nombre será dado por teclado.  */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del fichero: "); //pido el nombre del fichero
		String nombreFichero = sc.nextLine(); //para que funcione debo poner tabla.dat

		try {
			
			FileInputStream fis = new FileInputStream(nombreFichero); //para leer el fichero binario con el nombre que de el usuario por pantalla (tabla.dat)
			DataInputStream dis = new DataInputStream(fis); //para leer el int (tipo de dato primitivo) del archivo binario
			
			System.out.println("Contenido de la tabla:");
			for (int i = 0; i < 10; i++) { //recorro la tabla
				int num = dis.readInt(); // declaro variable numero donde guardo los valores que serán leidos del objeto dis 
				System.out.println("Número " + (i + 1) + ": " + num); //muestro los numeros, aumentando la posicion en cada iteracion
			}
			
			//cerramos los recursos abiertos, en orden inverso
			fis.close();	
			dis.close();	
			sc.close();
			
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
	}
}
