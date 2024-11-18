package clases;

import java.util.Scanner;

public class ArraysYFor_PedirLongitudTablaYDeclararla_2110 {
	//TODO Pedir longitud tabla y declararla
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Longitud de la tabla:");
		int longitud = sc.nextInt(); // pido longitud tabla al usuario
		
		int numerosUsuario[] = new int [longitud]; // declaro la tabla con la longitud que he pedido en el scanner
		System.out.println("La longitud será de: " + numerosUsuario.length); // imprimo la longitud de mi tabla             // en este caso, sería lo mismo poner la variable 'longitud'pq ahora mismo valen igual
		                                                                                                                   //pero esto se hace por si se cambia el valor de 'longitud' en algun momento
		int numeroIntroducido =0;                                                                                                         //o de la tabla, ya que son variables independientes.
		
		for (int i=0; i<longitud; i++) {
			System.out.println("Número " + (i+1 + ":"));
			numeroIntroducido = sc.nextInt();  // pido valor al usuario
			numerosUsuario[i]=numeroIntroducido;  //el valor que me da el usuario lo asigno en la posicion de la tabla	
		}
		//for (int numero : numerosUsuario){} EN 'NUMERO' ME GUARDA EL VALOR DE LA POSICION CORRESPONDIENTE EN LA TABLA. ES LO MISMO QUE LO DE ABAJO.
		for (int i=0; i<longitud; i++) { // PARA RECORRER LA TABLA
			System.out.println("El número introducido en la posición " + i + " es: " + numerosUsuario[i]);
		}
	//TODO Di si cada número que introduce el usuario es par o impar:
		for (int i=0; i<longitud; i++) {
		
			if (numerosUsuario[i] %2 == 0){
				System.out.println(numerosUsuario[i]);
				System.out.println("número PAR");
			}
			else if (numerosUsuario[i] %2 !=0){
				System.out.println(numerosUsuario[i]);
				System.out.println("número IMPAR");	
			}
		}
		
		
		sc.close();
	}

}
