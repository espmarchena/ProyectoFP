package es.cesur.cajaNegra_Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaNegra {

	@Test
	void claseDeEquivalencia1() {
		int resultadoReal = CajaNegra.diasDeMes(1);
		int resultadoEsperado = 31;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia2() {
		int resultadoReal = CajaNegra.diasDeMes(0);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia3() {
		int resultadoReal = CajaNegra.diasDeMes(13);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void claseDeEquivalencia4() {
		int resultadoReal = CajaNegra.diasDeMes(4);
		int resultadoEsperado = 30;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia5() {
		int resultadoReal = CajaNegra.diasDeMes(2);
		int resultadoEsperado = 28;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
}
