package es.cesur.refactorizacion;

public class ExtraerVariableLocal {

	public static void main(String[] args) {
		int numero = 3;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero)); // seleccionamos el String que queremos refactorizar, en este caso "El factorial de " con la doble comilla incluida
		//le damos a refactor/extraer variable local y esto extraerá en una variable con el nombre que le hayamos dado que contenga el string que habiamos seleccionado
		
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
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

public class CalcularFactorial {

	public static void main(String[] args) {
		int numero = 3;
		String factorial = "El factorial de ";
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
*/