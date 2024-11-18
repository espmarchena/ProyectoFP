package clases;
import java.util.Scanner;
public class PedirNumeroConIf {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);

		/*System.out.println("Dime un número de una cifra:");
		int num =teclado.nextInt();
		
		if(num==1) {
			System.out.println("suma");
		}	
		if(num==2) {
			System.out.println("resta");
		}
		if(num==3) {
			System.out.println("multiplicación");
		}
		if(num==4) {
			System.out.println("división");
		}	
		if(num>=5) { //else if(num>=5) {
			System.out.println("error");
		}
		teclado.close();
		lo anterior está erróneo porque no contempla los números negativos. Lo correcto sería:*/
		
		/*System.out.println("Dime un número de una cifra:");
		int num =teclado.nextInt();
		
		if(num==1) {
			System.out.println("suma");
		}	
		else if(num==2) {
			System.out.println("resta");
		}
		else if(num==3) {
			System.out.println("multiplicación");
		}
		if(num==4) {
			System.out.println("división");
		}
		else {
			System.out.println("error");
		}*/
		
		
		System.out.println("-------------------------------");
		
		System.out.println("Dime una opción:");
		char opcion =teclado.nextLine().charAt(0);
		
		if(opcion=='1' || opcion=='+') {
			System.out.println("suma");
		}
		else if(opcion=='2'|| opcion=='-') { //sino es 2 pero es -
			System.out.println("resta");
		}
		else if(opcion=='3'|| opcion=='*') { //sino es 3 pero es *
			System.out.println("multiplicación");
		}
		else if(opcion=='4'|| opcion=='/') { //sino es 4 pero es /
			System.out.println("división");
		}
		else {
			System.out.println("error");
		}
		
		teclado.close();
	}
}
