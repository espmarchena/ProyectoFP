package es.cesur.cajaNegra_Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaNegra {

	@Test
	void claseDeEquivalencia1() {
		int resultadoReal = CajaNegra.pedirProducto(10);
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia2() {
		int resultadoReal = CajaNegra.pedirProducto(51);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia3() {
		int resultadoReal = CajaNegra.pedirProducto(0);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia4() {
		int resultadoReal = CajaNegra.seleccionarTipoPago(10);
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void claseDeEquivalencia5() {
		int resultadoReal = CajaNegra.seleccionarTipoPago(30);
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia6() {
		int resultadoReal = CajaNegra.seleccionarTipoPago(40);
		int resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void claseDeEquivalencia7() {
		int resultadoReal = CajaNegra.seleccionarTipoPago(1);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
}
