package estudiandoparaelexamen1;

import java.util.Scanner;

public class BooleanCompararNumerosIgualesMayorMenor {

	public static void main (String ars []) {
		
	//Crea un programa que pida al usuario que introduzca dos números y determine si:
	//son iguales, diferentes, o si uno es mayor que el otro.	
		
		Scanner sc = new Scanner (System.in);	
		System.out.println("Dime dos números:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		boolean sonIguales = num1 == num2;
		boolean esMayor = num1>num2;
			
		if (sonIguales) {
			System.out.println("Numeros iguales");
		}
		else if (esMayor) {
			System.out.println("primer numero mayor al segundo");
		}
		else {
			System.out.println("segundo numero mayor al primero");
		}
		
		
	sc.close();
	}
}
