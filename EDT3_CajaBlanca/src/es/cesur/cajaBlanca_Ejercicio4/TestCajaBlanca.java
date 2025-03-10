package es.cesur.cajaBlanca_Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void camino1() {
		String resultadoReal= esVocal.esVocal("hola"); // hay que poner el nombre de la clase por delante del metodo para que compile
		String resultadoEsperado = "No has introducido un único carácter.";
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
}
