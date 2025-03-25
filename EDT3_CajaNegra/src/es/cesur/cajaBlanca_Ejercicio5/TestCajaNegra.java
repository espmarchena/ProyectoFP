package es.cesur.cajaBlanca_Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaNegra {

	@Test
	void testEquivalencia1() {
		Persona p = new Persona(2000);
		p.setFallecimiento(2000);
		int[] resultadoReal = {p.getAnyoNacimiento(), p.getAnyoFallecimiento()};
		int[] resultadoEsperado = {2000, 3000};
		assertArrayEquals(resultadoReal, resultadoEsperado);
	}
	
	
}
