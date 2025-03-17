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

	@Test
	void camino2() {
		String resultadoReal= esVocal.esVocal("2"); // hay que poner el nombre de la clase por delante del metodo para que compile
		String resultadoEsperado = "El carácter no es una letra.";
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino3() {
		String resultadoReal= esVocal.esVocal("a"); // hay que poner el nombre de la clase por delante del metodo para que compile
		String resultadoEsperado = "El carácter es una vocal.";
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino4() {
		String resultadoReal= esVocal.esVocal("y"); // hay que poner el nombre de la clase por delante del metodo para que compile
		String resultadoEsperado = "El carácter a veces es una vocal y a veces es una consonante.";
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino5() {
		String resultadoReal= esVocal.esVocal("c"); // hay que poner el nombre de la clase por delante del metodo para que compile
		String resultadoEsperado = "El carácter es una consonante.";
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	
}
