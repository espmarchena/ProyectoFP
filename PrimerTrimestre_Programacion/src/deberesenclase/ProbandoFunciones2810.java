package deberesenclase;

import java.util.Scanner;

public class ProbandoFunciones2810 {

	//funcion que recibe un numero e imprime por pantalla si es par o impar
	//funcion que recibe un numero e imprime con un boolean si es true es par, si es false es impar
	
	public static void main (String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Número");
		int n = sc.nextInt();
		numero (n);
		
		for (int i=0; i<=n; i++){         //CON ESTO CREO UN BUCLE CON EL QUE VERÉ SI UN NUMERO A PARTIR DE 0 ES PAR O IMPAR TANTAS VECES COMO EL NUMERO QUE EL USUARIO META EN EL SCANNER.
		  numero (i);                       // CON ESTO LLAMO A LA FUNCION
		}
		
		
		for (int i=0; i<=n; i++){         //
			  boolean par = parImpar(i);
			  if (par) {
				  System.out.println("El número " + i + " es par");
			  }
			  else {
				  System.out.println("El número " + i + " es impar");
			  }  
		}
		
		
		sc.close();
		
		System.out.println("Fin del programa¡¡¡");
	}
	
	public static void numero (int num) {

		if(num%2 ==0) {
			System.out.println("Número PAR");
		}
		else {
			System.out.println("Número IMPAR");
		}
	
	}

	public static boolean parImpar (int numero) {
		return numero%2 == 0; //me va a devolver si es true (par) o false (impar)
	}
	
	
	public static void imprimirParImpar (boolean par) {
		
		
	}
	
	//funcion que pida un numero y que devuelva una tabla de esa longitud y en cada posicion decir si el numero es par o impar
	
}
