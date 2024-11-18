package estudiandoparaelexamen1;

import java.util.Scanner;

public class BooleanYEquals_EjercicioContraseña {

	public static void main (String args[]) {
		
	/* Crea un programa que pida al usuario que introduzca una contraseña y verifique si es correcta.
	Supongamos que la contraseña correcta es "admin123" */
		
	System.out.println("Dime la contraseña");
	Scanner sc = new Scanner (System.in);
	String s = sc.nextLine();
	
	boolean esCorrecta = s.equals("admins123");
	
	if (esCorrecta) {
		System.out.println("Contraseña correcta");
	}
	else {
		System.out.println("Contraseña incorrecta");
	}
	
	
	
	/*
	esto está correcto pero no emplea boolean:
	 
	if (s.equals("admin123")) {
		System.out.println("Contraseña correcta");
	}
	else {
		System.out.println("Contraseña incorrecta");
	}*/
	
	
	
	sc.close();
	
	}
}
