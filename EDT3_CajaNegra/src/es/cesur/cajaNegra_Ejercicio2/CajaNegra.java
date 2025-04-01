package es.cesur.cajaNegra_Ejercicio2;

public class CajaNegra {

	public static int cambiarSemaforo(String color) {
		if (color == "rojo") {
			// Cambiar semáforo a ROJO
			return 1;
		} else if (color == "amarillo") {
			// Cambiar semáforo a AMARILLO
			return 1;
		} else if (color == "verde") {
			// Cambiar semáforo a VERDE
			return 1;
		} else {
			return 0;
		}
	}

}
