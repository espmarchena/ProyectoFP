package estudiandoparaelexamen1;

import java.util.Scanner;

public class If_NumMayor {
	//Pedir dos números por pantalla al usuario y decir cuál de los dos es mayor
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime un numero:");
		int num1 = sc.nextInt();
		
		System.out.println("Dime otro numero:");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println("El número  mayor es: " + num1);
		}
		else {
			System.out.println("El número mayor es: " + num2);
		}
		
		
		
		
		sc.close();

	}

}
