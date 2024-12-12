package examencorregido20241108;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String opcion;
		
		do {
			System.out.println("Dime un número entre el 1 y el 7");
			opcion = sc.nextLine();
			
			switch (opcion) {
				case "1":
					System.out.println("Lunes");
					break;
				case "2":
					System.out.println("Martes");
					break;
				case "3":
					System.out.println("Miércoles");
					break;
				case "4":
					System.out.println("Jueves");
					break;
				case "5":
					System.out.println("Viernes");
					break;
				case "6":
					System.out.println("Sábado");
					break;
				case "7":
					System.out.println("Domingo");
					break;
				case "0":
					System.out.println("Adiós");
					break;
				default:
					System.out.println("Error en la opción");
			
			}
		}
		while(!opcion.equals("0"));		
		
		sc.close();

	}

}
