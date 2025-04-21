package es.cesur.ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Entero_Ej1 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        int numero = sc.nextInt();
	        
	        try{
	        	FileOutputStream fos = new FileOutputStream("uno.bin"); //para crear el fichero binario
	        	DataOutputStream dos = new DataOutputStream(fos); //para escribir el int (tipo de dato primitivo) en el archivo binario
	        	
	            dos.writeInt(numero); //metodo que proporciona la clase DataOutputStream, para escribir un int en el fichero
	            
	            System.out.println("Número guardado correctamente en uno.bin");
	            
	          //cerramos los recursos abiertos, en orden inverso
	            dos.close();
	            fos.close();
	            sc.close();
	            
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el fichero: " + e.getMessage());
	        }
	    }
}
