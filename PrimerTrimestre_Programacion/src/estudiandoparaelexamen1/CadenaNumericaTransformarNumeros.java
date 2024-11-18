package estudiandoparaelexamen1;

import java.util.Scanner;

public class CadenaNumericaTransformarNumeros {

	public static void main (String args[]) {
		
		//PEDIR CADENA NUMERICA Y TRANSFORMAR A NUMEROS. Se debe comprobar que los caracteres intoducidos son numeros. Longitud max de 5 digitos.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Cadena texto");
		String cadena = sc.nextLine();
		
		
		if (cadena.length()<=5) { //controlo que si la longitud se pasa de 5 digitos, no entra.
			boolean ok = true; //en el momento que se detecte que uno de los caracteres no es un numero, la pondre false
			int contadorCarateresNumericos = 0; //contador para saber cuantos caracteres no numericos hay
			int i=0;
			
			while (i<cadena.length() && ok){ //recorro la cadena
				char c = cadena.charAt(i); //me va a dar cada caracter de la cadena de numeros
				System.out.println("El caracter es " + c); //me los muestra
				
				if (c<'0' || c>'9') { //compruebo que todos los caracteres introducidos son numeros
					ok= false; //sino se cumple la condicion del if, no es un numero
					contadorCarateresNumericos++;
				}
				i++;
				
			}
			if(ok) {
				int numero=0;
				for (i=0; i>cadena.length(); i++) {
					/*numero = numero*10 + ((int)cadena.charAt(i)-'0'); // transformo la cadena a numeros*/
					char c = cadena.charAt(i); //me va a dar cada caracter de la cadena de numeros
					int n = c-'0'; // el -'0' convierte un caracter a su numero
					numero = numero*10 + n; // decenas, centenas....
				}
				System.out.println("El número es: " + numero);
			}
			else {
				System.out.println("Numero no válido. Se han encontrado " + contadorCarateresNumericos + " caracteres numericos"); // muestro cuantos caracteres no numericos se han registrado
			}
			
		}
		else { // arroja error porque la cadena se pasa de 5 digitos
			System.out.println("ERROR. Se ha superado la longitud permitida");
		}
		
		
		
		
		
		sc.close();
	}
}
