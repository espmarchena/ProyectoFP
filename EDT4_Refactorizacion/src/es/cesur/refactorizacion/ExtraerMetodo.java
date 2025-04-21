package es.cesur.refactorizacion;

public class ExtraerMetodo {

	public static void main(String[] args) {
		int numero = 3;
		int contador = 1; // Seleccionamos desde esta línea
		double resultado = 1;
		
		while (contador <= numero) {
			resultado = resultado * contador;
			contador++;
		} // Hasta esta línea
		//seleccionamos lo que queremos extraer a un metodo y le damos a refactor/extraer metodo. Le damos un nombre y cambiamos el modificador de acceso y quedaria como el siguiente codigo 
	}
}

/*
package es.cesur.refactorizacion;

public class ExtraerMetodo {

	public static void main(String[] args) {
		int numero = 3;
		calcularFactorial(numero);
	}

	public static void calcularFactorial(int numero) {
		int contador = 1; // Seleccionamos desde esta línea
		double resultado = 1;
		while (contador <= numero) {
			resultado = resultado * contador;
			contador++;
		} // Hasta esta línea
	}

}
*/