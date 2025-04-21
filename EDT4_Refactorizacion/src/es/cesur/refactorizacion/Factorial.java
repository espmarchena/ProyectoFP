package es.cesur.refactorizacion;

public class Factorial implements IFactorial {

	@Override
	public double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
	//seleccionamos el metodo completo y le damos a refactor/extraer interfaz. Le ponemos el nombre que queremos que lleve y creará la interfaz con el metodo
}
