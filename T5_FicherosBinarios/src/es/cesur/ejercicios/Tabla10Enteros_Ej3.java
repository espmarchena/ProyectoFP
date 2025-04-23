package es.cesur.ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

	/*3. Tabla 10 enteros - Realizar un programa en JAVA que lea una tabla de 10 enteros 
	por teclado y vaya metiéndolos uno por uno en un fichero binario llamado “tabla.dat”.*/

public class Tabla10Enteros_Ej3 {

	    public static void main(String[] args) {
	    	
	        int[] tabla = new int[10]; //declaro un array de 10 posiciones de tipo int 
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Introduce 10 números enteros:");
	        
	        for (int i = 0; i < 10; i++) { //recorro el array
	            System.out.print("Número " + (i + 1) + ": "); //en cada vuelta me va diciendo la siguiente posicion
	            tabla[i] = sc.nextInt(); //en cada posicion guarda el numero que se pasa por teclado
	        }
	        
	        try {
	        	FileOutputStream fos = new FileOutputStream("tabla.dat"); //para crear el fichero binario
	        	DataOutputStream dos = new DataOutputStream(fos); //para escribir el int (tipo de dato primitivo) en el archivo binario
	        	
	        	for (int i = 0; i < tabla.length; i++) { //recorro el array
	        	    dos.writeInt(tabla[i]); //escribe cada numero del array
	        	}
	            
	            System.out.println("Tabla guardada correctamente en tabla.dat");
	            
		        //cerramos los recursos abiertos, en orden inverso
	            dos.close();
	            fos.close();
	            sc.close();
	            
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el fichero: " + e.getMessage());
	        }
	    }
	}

