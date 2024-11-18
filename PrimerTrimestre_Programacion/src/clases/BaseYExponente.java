package clases;


public class BaseYExponente {

	//Dar dos números (base y exponente) y elevar uno al otro
	
	public static void main (String args[]) {
	
		int resultado= 1;
		int num1 = 2; ///base
		int num2 = 3; //exponente
		int contador = 0; //para saber nº veces que estoy ejecutando las cosas
		
		 while (contador < num2) { // que el nº de veces que se repita sea menor al exponente, o sea a las veces por las que se tiene que multiplicar la base
			 
			resultado= num1 * resultado; //voy a ir guardando el resultado de mis operaciones
			
			System.out.println("Iteración " + contador + ": " + resultado);
			contador++;
		 }
		 
		 System.out.println("El resultado es: " + resultado);
		 
	}
}
