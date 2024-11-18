package estudiandoparaelexamen1;

import java.util.Scanner;

public class RecorreCadenaAlRevesImprimirAlDerecho {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca una cadena de texto:");
        String cadena = sc.nextLine();
        String nuevaCadena = "";
        int suma = 0;
        int contador = 0;
        
        for (int i = cadena.length()-1; i >= 0 ; i--) { //recorre la cadena al reves
            char c = cadena.charAt(i);
            nuevaCadena = c + nuevaCadena; // le da valor a la variable sumando cada caracter de la cadena a la izquierda para que aparezca derecha a pesar de haberla recorrido al reves
            System.out.print(c); // imprime la cadena al reves
            
            if (c >= '0' && c <= '9') {
                suma += (int) (c - '0');
                contador++;
            }

        }
        System.out.println(nuevaCadena); //imprime la cadena al derecho
        System.out.println("La suma de los carácteres numericos es: " + suma + "\nEl total de números en la cadena es: " + contador);
        
        
        
        
        
        sc.close();	
		
	}

}
