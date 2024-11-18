package deberesenclase;
import java.util.Scanner;
public class DeberesEnClase0710x3_SWITCH {
	public static void main (String args []) {
		
		/*- Utilizando un switch, pedir un número entre el 1 y el 12 y mostrar el mes correspondiente al numero*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int mes= sc.nextInt();
		String sMes = "";
		boolean mesCorrecto= true;
		switch (mes) {
		case 1:
			sMes = "Enero";
			break;
		case 2:
			sMes = "Febrero";
			break;
		case 3:
			sMes = "Marzo";
			break;
		case 4:
			sMes = "Abril";
			break;
		case 5:
			sMes = "Mayo";
			break;
		case 6:
			sMes = "Junio";
			break;
		case 7:
			sMes = "Julio";
			break;		
		case 8:
			sMes = "Agosto";
			break;
		case 9:
			sMes = "Septiembre";
			break;			
		case 10:
			sMes = "Octubre";
			break;		
		case 11:
			sMes = "Noviembre";
			break;		
		case 12:
			sMes = "Diciembre";
			break;
			
		default:
			mesCorrecto= false;
		}
			
		if (mesCorrecto) {
			System.out.println("El mes es: " + sMes);	
		}
		else {
			System.out.println("El número introducido no es un mes correcto");
		}
		
		sc.close();
		
		
		
	}
}
