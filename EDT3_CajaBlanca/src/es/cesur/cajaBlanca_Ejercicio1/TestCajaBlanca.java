package es.cesur.cajaBlanca_Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void camino1() {
		boolean  resultadoReal = CajaBlanca.esPar(2); //COMO esPar ES UN METODO ESTATICO DE OTRA CLASE DISTINTA, HAY QUE LLAMARLO CON EL NOMBRE DE LA CLASE DELANTE
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoReal, resultadoEsperado); //este metodo de JUnit compara si los valores de las dos variables coincide
	}
	
	@Test
	void camino2() {
		boolean  resultadoReal = CajaBlanca.esPar(1); //COMO esPar ES UN METODO ESTATICO DE OTRA CLASE DISTINTA, HAY QUE LLAMARLO CON EL NOMBRE DE LA CLASE DELANTE
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoReal, resultadoEsperado); //este metodo de JUnit compara si los valores de las dos variables coincide
	}
}
