package estudiandoparaelexamen2;

public class Ejercicio6 {
 //¿Cuál será la cadena de texto que se mostrará en la consola cuando se ejecute el System.out.println() de la función main del siguiente código?
	
	public static void main (String args[]) { 
		int num = 0;  
		int array[] = {0, 0};
		
		cambiarValores(num, array);  
		System.out.println(num + " – " + array[0] + " – " + array[1]); 
	} 
	
	public static void cambiarValores(int num, int array[]){ 
		num = 5; 
		array[0] = 10; 
		array[1] = 20;  
	} 
} 
 //como no estoy devolviendo el valor (return), a 'num' le estoy haciendo una copia pero no la uso, por lo que no vale 5 sino 0