package examenfinal1trimestre;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea un programa con el siguiente contenido:
		 * - Declara una matriz de enteros 3x3 con valores por defecto
		 * - Crea una función obtenerSumaNumerosPrincipal que recibe la matriz y devuelve la suma total de los valores de la diagonal principal
		 * - Crea una función obtenerMultiplicacionNumerosSecundaria que recibe la matriz y devuelve la multiplicación total de los valores de la diagonal secundaria
		 * - Crea un menú con 3 opciones:
		 * 1. Ver resultado de la suma de la diagonal principal
		 * 2. Ver resultado de la multiplicación de la diagonal secundaria
		 * 0. Salir Se debe pedir al usuario una opción mientras no introduzca un 0. Se debe avisar al usuario si la opción introducida no es correcta
		 */

		Scanner sc = new Scanner(System.in);
		
		// Crear matriz 3x3 con valores predeterminados
		int[][] matriz =
			{{ 1, 2, 3},
			{ 4, 5, 6},
			{ 7, 8, 9}};

		String opcion;
		
		do {
			System.out.println("1. Ver resultado de la suma de la diagonal principal");
			System.out.println("2. Ver resultado de la multiplicación de la diagonal secundaria");
			System.out.println("0. Salir");

			System.out.println("Seleccione una opción:");
			opcion = sc.nextLine();

			switch (opcion) {
			case "1":
				obtenerSumaNumerosPrincipal(matriz);							// Llamar a la función obtenerSumaNumerosPrincipal
				break;

			case "2":
				obtenerMultiplicacionNumerosSecundaria(matriz);					// Llamar a la función obtenerMultiplicacionNumerosSecundaria
				break;

			case "0":
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida. Por favor, elija una opción correcta.");
			}
		}
		while (!opcion.equals("0"));
		System.out.println("¡Fin del programa!");
	}

	
	
	// Función para obtener la suma de los elementos de la diagonal principal
	public static int obtenerSumaNumerosPrincipal(int[][] matriz) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma += matriz[i][i]; // Sumo los elementos de la diagonal principal
		}
		System.out.println("La suma de la diagonal principal es: " + suma);
		return suma;
	}

	// Función para obtener la multiplicación de los elementos de la diagonal
	// secundaria
	public static int obtenerMultiplicacionNumerosSecundaria(int[][] matriz) {
		int multiplicacion = 1;
		for (int i = 0; i < matriz.length; i++) {
			multiplicacion *= matriz[i][matriz.length - 1 - i]; // Multiplico los elementos de la diagonal secundaria
		}
		System.out.println("La multiplicación de la diagonal secundaria es: " + multiplicacion);
		return multiplicacion;
	}
	
}
