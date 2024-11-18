package casa;
import java.util.Scanner;
public class DeberesEnCasa4_1310_MENU_SWITCH {

	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		
			do {
	
				System.out.println("Este es el menú disponible:");
				System.out.println("Área");
				System.out.println("Perímetro");
				System.out.println("Salir");
				System.out.println("Selecione una opción:");
				opcion=sc.nextInt();
				
				switch (opcion) {
				case 1:
					System.out.println("Introduzca el lado del cuadrado:");
					int lado = sc.nextInt();
					System.out.println("Area= " + (lado*lado));
					break;
				case 2:
					System.out.println("Introduzca el lado del cuadrado:");
					lado = sc.nextInt();
					System.out.println("Perímetro= " + (lado*4));
					break;
				case 3:
					System.out.println("Hasta otra!!!!");
					break;
				default:	
				}
			}	
		
		while(opcion!=3); 
		
		
		
	
	
		sc.close();	
	}
}
