package estudiandoparaelexamen1;

import java.util.Scanner;

public class Char_CharAt0_Castear {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una cadena: ");
		String s = teclado.nextLine();

		char c = s.charAt(0);

		System.out.println("El primer caracter de tu cadena es: " + c);

		System.out.println("El valor numerico de tu primer caracter es: " + ((int) c)); // convierto c en numeros
		System.out.println("El siguiente valor numerico de tu primer caracter es: " + ((int) c + 1)
				+ " y corresponde a la letra " + (char) (c + 1)); // convierto c a letra

		
		
		System.out.println("-------------------------------------------------------");
		
		
		char z = 'Z';
		
		System.out.println(z); // imprime Z
		System.out.println((int)z); // imprime valor numerico de Z
		System.out.println((int)z+1); // imprime siguiente valor numerico de Z
		System.out.println((char)(z+1)); // imprime letra del siguiente valor numerico de Z
		
		
		System.out.println("-------------------------------------------------------");
		
		char e = 'E';
		
		System.out.println(e); // imprime E
		System.out.println((int)e); // imprime valor numerico de E
		System.out.println((int)e+1); // imprime siguiente valor numerico de E
		System.out.println((char)(e+1)); // imprime letra del siguiente valor numerico de E
		
		
		
		teclado.close();

	}

}
