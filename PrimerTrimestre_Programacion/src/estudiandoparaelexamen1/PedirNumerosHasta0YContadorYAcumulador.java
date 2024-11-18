package estudiandoparaelexamen1;

import java.util.Scanner;

public class PedirNumerosHasta0YContadorYAcumulador {

	public static void main(String[] args) {
		// Pedir numeros hasta que se introduzca un 0 y mostrar cuantos números se han introducido y mostrar la suma de todos ello. AÑADIDO (si son pares)
		
		Scanner sc = new Scanner (System.in);
		int numero;
		int suma=0; //acumulador
		int contador=0; //contador
		
		
		do {
			System.out.println("Dime un número");
			numero = sc. nextInt();
			
			if(numero%2==0) { //AÑADIDO (si son pares)
				/*suma = suma + numero*/ suma+= numero; // para el acumulador
				contador++; //para el acumulador
			}
		
			
		}
		while (numero!=0);
		System.out.println(suma);
		System.out.println(contador);
		
		
		
		sc.close();
	}

}
