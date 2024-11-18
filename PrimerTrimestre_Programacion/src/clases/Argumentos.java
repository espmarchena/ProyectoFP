package clases;

public class Argumentos {

	public static void main (String args []) {
		
		System.out.println("El número de parámetros recibido es: " + args.length); // Te dice cuantos parametros se han introducido en Run Configurqations / Argumentos
		System.out.println("Bienvenida " + args[0] + " " + args[1]);
		
		System.out.println("Tienes " + args[2] + " años.");
		
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < args.length; i++) { //para recorrer toda la tabla e imprimir todos los parametros
			System.out.println(args[i]);
		}
		
		
		
		
		
	}
}
