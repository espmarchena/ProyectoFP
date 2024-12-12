package estudiandoparaelexamen2;
import java.util.Scanner;
public class Examen2Ejercicio1yo {

	public static void main(String[] args) {
	/*Crea un programa con las siguientes funciones:
		- Función llamada contarCaracteres que recibe dos parámetros: una cadena de texto y  un array de caracteres
			y devuelve un array de enteros de la misma longitud que el array de caracteres.
			El nuevo array contendrá en cada posición el número de veces que aparece el carácter de la posición en la cadena de texto.
			  
		-Función main que pide al usuario por pantalla la cadena de texto y declara el siguiente array de caracteres: {‘l’, ‘a’, ‘c’, ‘m’}.
			Una vez que pide la información llama a la función anterior y con el resultado de la llamada, imprime los valores.
			Se debe tener en cuenta que el array podría ser otro cualquiera, y que no tiene por qué ser éste que he puesto. 
			
	Por ejemplo, el usuario introduce “guillamón apruébame”.
	En este caso el programa devolverá. {2, 3, 0, 2}. La l aparece 2 veces, la a 3 veces, la c 0 veces, y la m 2 veces. */
	
	Scanner sc = new Scanner (System.in);	
	System.out.println("Cadena de texto");
	String cadena= sc.nextLine();
	char[] arrayCaracteres = {'l', 'a', 'c', 'm'};
	
	int[] resultado = contarCaracteres(cadena, arrayCaracteres);
	
	for (int i=0; i<arrayCaracteres.length; i++) {
		System.out.println("El carácter " + arrayCaracteres[i] + " aparece " + resultado[i] + " veces.");
	}
	
	}

	public static int[] contarCaracteres (String cadena, char[] arrayCaracteres) {
		int[] arrayEnteros = new int [arrayCaracteres.length];
		
		for (int i =0; i<arrayCaracteres.length; i++) { //recorro el array
			int contador=0;
		
			for (int j =0; j<cadena.length();j++) {
				if (cadena.charAt(j) == arrayCaracteres[i]){
					contador++;
				}
			}
			arrayEnteros[i]= contador; // guardar en el array del resultado de enteros, la cantidad del contador 
		}
		
		
		return arrayEnteros;
	}
	

	
}
