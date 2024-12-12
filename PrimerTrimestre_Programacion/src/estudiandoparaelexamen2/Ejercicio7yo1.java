package estudiandoparaelexamen2;
import java.util.Scanner;
public class Ejercicio7yo1 {
	
	public static void main (String args[]) {
	//Crea un programa que pida al usuario números mientras el número introducido sea distinto de 0
	//Cuando el usuario introduce un 0, el programa debe mostrar cuantos números de los introducidos eran pares y cuantos impares.  
		
		Scanner sc = new Scanner (System.in);
		int num;
		int acumuladorPar=0;
		int acumuladorImpar=0;
		
		do {
			System.out.println("Num entre 0 y 100: ");
			num= sc.nextInt();
			
			if (num!=0 && num%2==0) { //controlo que no cuente el 0 en los pares
				acumuladorPar++;
			}
			else if(num%2!=0) {
				acumuladorImpar++;
			}
			
		}
		while (num!=0);	
		System.out.println("Pares " + acumuladorPar);
		System.out.println("Impares: " + acumuladorImpar);
		
		
		sc.close();
	}
	

}
