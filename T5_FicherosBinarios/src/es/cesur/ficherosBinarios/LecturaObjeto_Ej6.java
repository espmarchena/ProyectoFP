package es.cesur.ficherosBinarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaObjeto_Ej6 {

	public static void main(String[] args) {

		try {
			// Accede al fichero creado en el proyecto: T5_FicherosBinarios
			FileInputStream fis = new FileInputStream("../T5_FicherosBinarios/objeto.dat");// Tiene que existir el fichero que vamos a leer

			//Necesitamos un objeto de la clase ObjectInputStream para leer un objeto en al fichero binario
			ObjectInputStream ois = new ObjectInputStream(fis);

			// Leemos un objeto del archivo con .readObject()
			Asignatura asignaturaLeida = (Asignatura) ois.readObject();
			
			System.out.println("Objeto leído del fichero, con los siguientes datos para sus atributos: ");
			System.out.println(asignaturaLeida.getNombre());
			System.out.println(asignaturaLeida.getCodigo());
			System.out.println(asignaturaLeida.getNumHoras());

			// Cerramos los recursos abiertos
			ois.close();
			fis.close();
			
			System.out.println("¡Archivo leído correctamente!");

		} catch (IOException | ClassNotFoundException i) {
			System.out.println("Se produjo un error de Archivo");
			System.out.println(i.getMessage());
		}
	}
}