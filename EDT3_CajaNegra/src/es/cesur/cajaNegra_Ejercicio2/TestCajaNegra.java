package es.cesur.cajaNegra_Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaNegra {

	@Test
	void claseDeEquivalencia1() {
		int resultadoReal = CajaNegra.cambiarSemaforo("rojo");
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void claseDeEquivalencia2() {
		int resultadoReal = CajaNegra.cambiarSemaforo("amarillo");
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia3() {
		int resultadoReal = CajaNegra.cambiarSemaforo("verde");
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia4() {
		int resultadoReal = CajaNegra.cambiarSemaforo("azul");
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	
}
