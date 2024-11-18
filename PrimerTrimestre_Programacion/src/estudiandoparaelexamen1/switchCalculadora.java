package estudiandoparaelexamen1;

import java.util.Scanner;

public class switchCalculadora {
	
	public static void main (String args[]) {
	
	//Declara dos variables numéricas (con el valor que desees),
	//Muestra por consola la suma, resta, multiplicación y división.
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Número 2: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Operación (+, -, *, /: ");
		String opcion = sc.nextLine();
		
		
		int resultado= 0;
		
		switch (opcion) {
			case "+":
				resultado = num1 + num2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
				
			case "-":
				resultado = num1 - num2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
				
			case "*":
				resultado = num1 * num2;
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
				
			case "/":
				resultado = num1 / num2;
				System.out.println("El resultado de la división es: " + resultado);
				break;
		
			default:
				System.out.println("error");
		}		
		
	
	
	sc.close();
			
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

