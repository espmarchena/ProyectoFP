package estudiandoparaelexamen1;

import java.util.Scanner;

public class If_MayorDeEdad {

	public static void main(String[] args) {
		//Pedir al usuario una edad y mostrar por pantalla si es mayor de edad o no

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuántos años tienes???");
		int edad = sc.nextInt();
		
		if (edad>=18) {
			System.out.println("Mayor de edad");
		}
		else {
			System.out.println("Menor de edad");
		}
		
		
		
		
		
		sc. close();
		
	}

}
