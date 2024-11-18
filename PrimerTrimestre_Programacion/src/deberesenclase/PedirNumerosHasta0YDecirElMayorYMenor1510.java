package deberesenclase;

import java.util.Scanner;

public class PedirNumerosHasta0YDecirElMayorYMenor1510 {

	//Pedir al usuario que introduzca números hasta que introduzca el 0 y cuando lo haga decir el mayor y el  menor número introducido
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);	
	
		int num;
		int numeroMayor= 0;
		int numeroMenor= 100;
		
		do {
			
			System.out.println("Introduce un número entre 1 y 99:");
			num= sc.nextInt();
		
			if (num > numeroMayor && num<100){  //comparo ambos y si el numero que se introduce es el mayor de todos los introducidos hasta que entre el 0
				numeroMayor = num;   //lo guardo 
				
			}
			if (num < numeroMenor && num!=0){  //comparo ambos y si el numero que se introduce es el mayor de todos los introducidos hasta que entre el 0
				numeroMenor = num;   //lo guardo
			}
			
		}
		while(num != 0);
	
			System.out.println("El número mayor introducido es: " + numeroMayor);	
			System.out.println("El número menor introducido es: " + numeroMenor);
			
		sc.close();
		
	}	
}