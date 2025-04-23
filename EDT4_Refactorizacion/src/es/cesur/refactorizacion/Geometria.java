package es.cesur.refactorizacion;

public class Geometria {

	public static final int RADIOCIRCULO = 13; // radio del círculo;

	public static void main(String[] args) {
		int numero = RADIOCIRCULO; // radio del círculo;

		calcularPerimetro(numero);

		calcularSuperficie(numero);
	}

	public static void calcularSuperficie(int numero) {
		double numero3 = 3.14 * numero * numero;
		System.out.println("La superficie del círculo es " + numero3);
	}

	public static void calcularPerimetro(int numero) {
		double numero2 = 2 * 3.14 * numero;
		System.out.println("El perímetro del círculo es " + numero2);
	}
}


/*
package es.cesur.refactorizacion; 

public class Geometria {
	public static void main(String[] args) {
		int numero = 13; // radio del círculo;

		double numero2 = 2 * 3.14 * numero;
		System.out.println("El perímetro del círculo es " + numero2);

		double numero3 = 3.14 * numero * numero;
		System.out.println("La superficie del círculo es " + numero3);
	}
} 
*/
 