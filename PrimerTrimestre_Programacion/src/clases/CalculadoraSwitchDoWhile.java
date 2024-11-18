package clases;

import java.util.Scanner;

public class CalculadoraSwitchDoWhile {
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Número 2: ");
		int num2 = teclado.nextInt();
		teclado.nextLine(); // Este es para que no se salte la línea
		boolean opcionCorrecta = true;
		
		do {
			System.out.println("Operación (1 o +, 2 o -, 3 o *, 4 o /): ");
			String operacion = teclado.nextLine();
			int res = 0;
			opcionCorrecta = true;
			switch (operacion) {
				case "1", "+":
					res = num1 + num2;
					break;
				case "2", "-": 
					res = num1 - num2;
					break;
				case "3", "*": 
					res = num1 * num2;
					break;
				case "4", "/": 
					res = num1 / num2;
					break;
				default: 
					opcionCorrecta = false;
					
			}
			
			if (opcionCorrecta) {
				System.out.println("El resultado es: " + res);
			} else {
				System.out.println("Opción no correcta");
			}	
		}
		while (!opcionCorrecta);
		
		
		
		
		
		
		teclado.close();
		
		
	}
}
