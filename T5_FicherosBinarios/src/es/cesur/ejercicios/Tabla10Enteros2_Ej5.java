package es.cesur.ejercicios;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tabla10Enteros2_Ej5 {

	/*5. Tabla 10 enteros (2ª versión) - Realizar un programa en JAVA que lea una tabla de 10 enteros
	por teclado y la guarde de una sola vez (como un Objeto) en un fichero binario llamado “tabla.dat”. */
	
	public static void main(String[] args) {
		int[] tabla = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 10 números enteros:");
		for (int i = 0; i < 10; i++) { //recorro la tabla
			System.out.print("Número " + (i + 1) + ": "); //muestro los numeros, aumentando la posicion en cada iteracion
			tabla[i] = sc.nextInt(); //en cada posicion guarda el numero que se pasa por teclado
		}

		try {

			FileOutputStream fos = new FileOutputStream("tabla.dat"); //para escribir byte a byte el fichero binario
			ObjectOutputStream oos = new ObjectOutputStream(fos); //para escribir el objeto (el array) en el fichero
			oos.writeObject(tabla); //metodo para escribir el objeto (la tabla en este caso)
			System.out.println("Tabla guardada como objeto en tabla.dat");
			
			//cerramos los recursos abiertos, en orden inverso
			oos.close();
			fos.close();
			sc.close();

		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}
}