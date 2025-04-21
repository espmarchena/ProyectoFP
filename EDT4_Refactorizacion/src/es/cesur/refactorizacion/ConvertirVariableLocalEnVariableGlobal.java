package es.cesur.refactorizacion;

public class ConvertirVariableLocalEnVariableGlobal {

	public static void main(String[] args) {
		int numero = 3;
		String factorial = "El factorial de "; //convertir esta variable local a variable global: refactor/convert local variable to field
		System.out.println(factorial + numero + " es " + calcularFactorial(numero)); 
		
		numero = 5;
		System.out.println(factorial + numero + " es " + calcularFactorial(numero));
	}

	public static int calcularFactorial(int n) {
		
		if (n == 0) {
			return 1;

		} else {
			
			int resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}

/*
package es.cesur.refactorizacion;

public class ConvertirVariableLocalEnVariableGlobal {

	public static final int numero3 = 3;
	public static String factorial; // declaramos variable global

	public static void main(String[] args) {
		factorial = "El factorial de "; // iniciamos/asignamos variable global
		System.out.println(factorial + numero3 + " es " + calcularFactorial(numero3)); 
		
		int numero = 5;
		System.out.println(factorial + numero + " es " + calcularFactorial(numero));
	}

	public static int calcularFactorial(int n) {
		
		if (n == 0) {
			return 1;

		} else {
			
			int resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
*/

