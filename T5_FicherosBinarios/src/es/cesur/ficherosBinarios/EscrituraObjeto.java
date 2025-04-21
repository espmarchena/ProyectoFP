package es.cesur.ficherosBinarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraObjeto {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("objeto.dat"); //para crear el fichero binario

			//Necesitamos un objeto de la clase ObjectOutputStream para escribir un objeto en al fichero binario

			ObjectOutputStream oos = new ObjectOutputStream(fos); //para escribir objetos en el fichero binario

			/* OBJETO QUE VAMOS A ESCRIBIR EN EL FICHERO BINARIO */
			Asignatura inglesB1 = new Asignatura("Inglés B1", 80, "IB1"); //creamos el objeto que vamos a escribir en el fichero

			// Escribir un objeto en el fichero
			oos.writeObject(inglesB1); // si quitamos el objeto inglesB1 y lo instanciamos asi, tb es válido: oos.writeObject(new Asignatura("Inglés B1", 80, "IB1"));

			// Cerramos los recursos abiertos
			oos.close();
			fos.close();
			
			System.out.println("¡Archivo creado correctamente!");

		} catch (IOException i) {
			System.out.println("Se produjo un error de Archivo");
		}
	}
}
