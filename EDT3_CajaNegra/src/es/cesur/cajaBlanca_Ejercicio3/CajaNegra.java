package es.cesur.cajaBlanca_Ejercicio3;

public class CajaNegra {

	public static int pedirProducto(int identificador) {
		if ((identificador >= 1) && (identificador <= 50)) {
			// Hacer el pedido
			return 1;
		} else {
			return 0;
		}
	}

	public static int seleccionarTipoPago(int codigo) {
		switch (codigo) {
		case 10:
		case 20:
		case 30:
		case 40:
			return 1;
		default:
			return 0;
		}
	}
}
