package es.cesur.ejercicios;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class LeerTabla10Enteros2_Ej6 {

	public static void main(String[] args) {
		
		try{
			
			FileInputStream fis = new FileInputStream("tabla.dat"); //para leer el fichero binario con el nombre que de el usuario por pantalla (tabla.dat)
			ObjectInputStream ois = new ObjectInputStream(fis); //para crear el objeto
			
			int[] tabla = (int[])ois.readObject();  //guardo en el array lo que se lee del objeto ois. Lo tengo que castear para que compile
			System.out.println("Contenido de la tabla: " + Arrays.toString(tabla)); //metodo para que la clase Array se convierta en un String con la lista de elementos del array tabla
			
			ois.close();
			fis.close();
			
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
	}
}