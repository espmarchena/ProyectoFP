package es.cesur.cajaBlanca_Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlancaTest {

	@Test
	void camino1() {
		String resultadoEsperado = CajaBlanca.edadPerro(-1);
		String resultadoReal = "La edad debe ser un número positivo.";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
	@Test
	void camino2() {
		String resultadoEsperado = CajaBlanca.edadPerro(2);
		String resultadoReal = "La edad es 21.0";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
	@Test
	void camino3() {
		String resultadoEsperado = CajaBlanca.edadPerro(9);
		String resultadoReal = "La edad es 49.0";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
}
