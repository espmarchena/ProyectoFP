package estudiandoparaelexamen1;

import java.util.Scanner;

public class Switch_Meses {

	public static void main(String[] args) {
		//Utilizando un switch, pedir un número entre el 1 y el 12 y mostrar el mes correspondiente al número

		
		Scanner sc = new Scanner (System.in);
		String opcion;
		
		do {
			System.out.println("Dime un número entre el 1 y el 12");
			opcion = sc.nextLine();
			
			switch (opcion) {
				case "1":
					System.out.println("Enero");
					break;
				case "2":
					System.out.println("Febrero");
					break;
				case "3":
					System.out.println("Marzo");
					break;
				case "4":
					System.out.println("Abril");
					break;
				case "5":
					System.out.println("Mayo");
					break;
				case "6":
					System.out.println("Junio");
					break;
				case "7":
					System.out.println("Julio");
					break;
				case "8":
					System.out.println("Agosto");
					break;
				case "9":
					System.out.println("Septiembre");
					break;
				case "10":
					System.out.println("Octubre");
					break;
				case "11":
					System.out.println("Noviembre");
					break;
				case "12":
					System.out.println("Diciembre");
					break;
				case "0":
					System.out.println("Adiós");
					break;
				default:
					System.out.println("Opción incorrecta");
			
			}
		}
		while(!opcion.equals("0"));		
		
		sc.close();
	
/*		
		Scanner sc = new Scanner (System.in);
		String opcion;
		
		do {
			System.out.println("Dime un número entre el 1 y el 12");
			opcion = sc.nextLine();
			
			switch (opcion) {
			case "0":
				System.out.println("Adiós");
			case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12":
				int numero = opcion.charAt(0)-'0';
				if (numero==1 && opcion.length()==2) {
					int numero2 = opcion.charAt(1) - '0';
					numero = numero * 10 + numero2;
				}	
				String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
				System.out.println(meses[numero-1]);
				break;
			default:
			System.out.println("Opción incorrecta");
			}
		
		}
		while(!opcion.equals("0"));
		
		sc.close();
		
*/		
	}

}
