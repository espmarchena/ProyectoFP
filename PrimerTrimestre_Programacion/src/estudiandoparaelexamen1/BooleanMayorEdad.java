package estudiandoparaelexamen1;

import java.util.Scanner;

public class BooleanMayorEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();

		// Verificar si es mayor de edad
		boolean esMayorDeEdad = edad >= 18;
		if (esMayorDeEdad) {
			System.out.println("Eres mayor de edad.");
		}
		else {
			System.out.println("No eres mayor de edad.");
		}
	}
}	
