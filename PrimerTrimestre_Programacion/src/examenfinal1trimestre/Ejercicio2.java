package examenfinal1trimestre;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Crea un programa con las siguientes funciones:
		//-Función que recibe un texto y devuelve un contador con los números encontrados
		//-Función que recibe un texto y devuelve si contiene espacios o no.   
		//-Función principal que pide al usuario una palabra que pida al usuario una palabra por pantalla,
		//valida si tiene espacios y en caso de no tener, muestra el número de números que tiene el texto.  

		
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Dame una cadena de texto. Puede tener números y espacios.");    
	    String texto = sc.nextLine();
	    boolean espacios = contieneEspacios(texto);
	    int numeros = contarNumeros(texto);
	    
	    if (espacios) {
	    	System.out.println("El texto contiene espacios.");
	    }
	    else {
	        System.out.println("El texto no contiene espacios y tiene " + numeros + " números.");
	    }
	        
	    sc.close();
	    }
	
	
	
	
    // Función que recibe un texto y devuelve un contador con los números encontrados.
    public static int contarNumeros(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= '0' && c <= '9') {
                contador++;
            }
        }
        return contador;
    }

    // Función que recibe un texto y devuelve si contiene espacios o no.
    public static boolean contieneEspacios(String texto) {
    	boolean contieneEspacios = false;
    	
    	for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == (' ')) {
                contieneEspacios = true;
            }
        }
    	
        return contieneEspacios;
    }
	
}