package es.cesur.Ficheros.Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Copiar_6 {
	
	/*6. Copiar - Realizar un programa en JAVA que lea el nombre de dos ficheros de texto 
	por teclado y copie el contenido del primero en el segundo. Si el segundo no existe 
	se creará y si existe, se machacará el contenido. */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el nombre del fichero origen: ");
        String ficheroOrigen = sc.nextLine();
        
        System.out.print("Introduce el nombre del fichero destino: ");
        String ficheroDestino = sc.nextLine();
		
        try {
            // Abrir el fichero origen para lectura
            BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen));
            
            // Abrir el fichero destino para escritura (se crea si no existe)
            BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroDestino));
            
            String mensaje;
            
            // Leer línea por línea del origen y escribir en destino
            while ((mensaje = br.readLine()) != null) {
                bw.write(mensaje);
                bw.newLine(); // Añadir salto de línea
            }
            
            // Cerrar los ficheros
            br.close();
            bw.close();
            sc.close();
		
            System.out.println("Contenido copiado correctamente de " + ficheroOrigen + " a " + ficheroDestino);
            
        } catch (IOException e) {
            System.err.println("Error al copiar los ficheros: " + e.getMessage());

        }
    }
}
