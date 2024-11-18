package deberesenclase;

import java.util.Scanner;

public class DeberesEnClase0910Abecedario {

	public static void main(String[] args) {
		//mostrar abecedario completo de mayusculas, en la misma linea (println sin ln)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el abecedario en línea:");
		char a= 65;
		
		while(a<91) {
			
		
			System.out.print(a + " ");
			a++;
			
			// escribir pares en un color e impares en otro color
			
//		if(a%2 == 0) {
//			System.out.println();
//		}
//		else 	
//			System.out.println();
		}
		
		sc.close();
	}

}
		