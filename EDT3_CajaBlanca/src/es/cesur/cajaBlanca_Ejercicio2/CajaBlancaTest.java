package es.cesur.cajaBlanca_Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlancaTest {

	@Test
	void camino1() {
		boolean resultadoReal = CajaBlanca.esParOImpar(2);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void camino2() {
		boolean resultadoReal = CajaBlanca.esParOImpar(1);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
}
