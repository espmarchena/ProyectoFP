package es.cesur.ejercicio25interfaces;

public class DiasMes {

	public static void main(String[] args) {

		diasDeMes("Noviembre");
		DiasMes.diasDeMes("Mayo");
	}

	public static String diasDeMes(String nombreMes) {
		String resultado = "";
		if (nombreMes == "Enero" | nombreMes == "Marzo" | nombreMes == "Mayo" | nombreMes == "Julio"
				| nombreMes == "Agosto" | nombreMes == "Octubre" | nombreMes == "Diciembre") {
			resultado = nombreMes + " tiene: 31 días";
			System.out.println(resultado);
			return resultado;
		} else if (nombreMes == "Abril" | nombreMes == "Junio" | nombreMes == "Septiembre" | nombreMes == "Noviembre") {
			resultado = nombreMes + " tiene: 30 días";
			System.out.println(resultado);
			return resultado;
		} else if (nombreMes == "Febrero") {
			resultado = nombreMes + " tiene: 28 días o 29 días (en año bisiesto)";
			System.out.println(resultado);
			return resultado;
		} else {
			resultado = "No has especificado un mes válido";
			System.out.println(resultado);
			return resultado;
		}
	}

}
