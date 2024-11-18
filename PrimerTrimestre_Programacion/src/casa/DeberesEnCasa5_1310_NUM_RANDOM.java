package casa;
import java.util.Scanner;
public class DeberesEnCasa5_1310_NUM_RANDOM {

	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		
		int contador=0;
		int max=100;
		int min=0;
		int range= (max-min) +1;
		int nUsuario;
		int nAleatorio = (int) ((range * Math.random()) +min);
		
		
		do {
			System.out.println("Introduce un número entre el 0 y el 100: ");
			nUsuario = sc.nextInt();
			
			if (nUsuario==nAleatorio) {
				System.out.println("Lo acertaste!!");
			
			}
			else if(nUsuario>nAleatorio) {
				System.out.println("El número introducido es mayor que el número secreto.");
			
			}
			else {
				System.out.println("El número introducido es menor que el número secreto.");
				
			}
		}
		while(nUsuario!=nAleatorio && contador<10);
		
		if(contador==10) {
			System.out.println("Has fallado!!");
			
		}
		
		sc.close();	
	}	
}
