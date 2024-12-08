package estudiandoparaelexamen2;
import java.util.Scanner;
public class Ejercicio4yo1 {

	public static void main(String[] args) {
		//Crea un programa que muestre un menú con 3 opciones y pida al usuario una opción:
		//- La opción 1 y la 2 muestran un mensaje diciendo la opción seleccionada y vuelven a mostrar el menú.
		//- La opción 3 es la única que permite salir del programa.
		//- El resto de las opciones muestran un mensaje de error y vuelven a mostrar el menú.  
   
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		do {
			System.out.println("Opción: ");
			opcion = sc.nextLine();
			
			switch (opcion){
			case "1":
				System.out.println("Opción 1 seleccionada");
				break;
			case "2":
				System.out.println("Opción 2 seleccionada");
				break;
			case "3":
				System.out.println("Salir");
				break;
			default:
				System.out.println("Error");
			}			
		}
		while(!opcion.equals("3"));
		System.out.println("Fin del programa.");
		
		sc.close();
	}


}
