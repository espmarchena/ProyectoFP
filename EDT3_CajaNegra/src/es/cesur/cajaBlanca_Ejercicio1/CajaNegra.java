package es.cesur.cajaBlanca_Ejercicio1;

public class CajaNegra {

	public static int diasDeMes(int mes) {
		int resultado = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			resultado = 31;
			System.out.println(resultado);
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			resultado = 30;
			System.out.println(resultado);
			break;
		}
		case 2: {
			resultado = 28;
			System.out.println(resultado);
			break;
		}
		default: {
			resultado = 0;
			System.out.println(resultado);
			break;
		}
		}
		return resultado;
	}

}
