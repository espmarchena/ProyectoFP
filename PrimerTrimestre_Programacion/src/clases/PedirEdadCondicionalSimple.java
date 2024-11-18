package clases;

import java.util.Scanner;

public class PedirEdadCondicionalSimple {
	public static void main(String args[]) {
		
	Scanner teclado;
	teclado = new Scanner (System.in); //abre flujo de comunicación entre el teclado y el usuario
	
	System.out.println("¿Qué edad tienes?");
	
	int edad=teclado.nextInt(); //significa que el programa introduce la edad que pone el teclado
	
	
	if(edad<18) {
		System.out.println("menor de edad");
	}
	else { //es todo lo que no es el if
		System.out.println("mayor de edad");
		
		teclado.close();
	}
	}
}
