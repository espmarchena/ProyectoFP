package clases;

import java.util.Scanner;

public class ForParaArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Longitud de la tabla:");
		int longitud = sc.nextInt(); // pido longitud tabla al usuario
		
		int numerosUsuario[] = new int [longitud]; // declaro la tabla con la longitud que he pedido en el scanner
		System.out.println("La longitud será de: " + numerosUsuario.length); // imprimo la longitud de mi tabla             // en este caso, sería lo mismo poner la variable 'longitud'pq ahora mismo valen igual
		                                                                                                                   //pero esto se hace por si se cambia el valor de 'longitud' en algun momento
	                                                                                                                      //o de la tabla, ya que son variables independientes.
		
		for (int i=0; i<longitud; i++) {
			System.out.println("Número " + (i+1 + ":"));
			int numeroIntroducido = sc.nextInt();  // pido valor al usuario
			numerosUsuario[i]=numeroIntroducido;  //el valor que me da el usuario lo asigno en la posicion de la tabla	
			int numero = numerosUsuario[i]; //asigno a la variable 'numero' el valor de la posicion de la tabla
			System.out.println("El número introducido en la posición " + i + " es: " + numero);
		}
		
		//si NO necesito la posición este FOR me vale:
		for(int numero : numerosUsuario) {
			System.out.println(numero);
			System.out.println("El número introducido en la posición es: " + numero);
			//para controlar la posicion usamos contador++;
		}
		
	sc.close();	
	}

}
