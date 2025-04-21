package es.cesur.ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeerEntero_Ej2{
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
    	
        try{
        	FileInputStream fis = new FileInputStream("uno.bin"); //para leer el fichero binario
            DataInputStream dis = new DataInputStream(fis); //para leer del fichero
            		
            dis.readInt(); //metodo que proporciona la clase DataInputStream, para leer un int en el fichero
            
            System.out.println("El número almacenado es: " + numero);
            
            
            //cerramos los recursos abiertos, en orden inverso
            dis.close();
            fis.close();
            sc.close();
            
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
