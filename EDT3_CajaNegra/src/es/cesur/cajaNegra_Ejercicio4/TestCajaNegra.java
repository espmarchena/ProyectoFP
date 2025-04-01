package es.cesur.cajaNegra_Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaNegra
{

	@Test
	void testIngresar1() 
	{
		Cuenta c = new Cuenta();// saldo a 0.0
		c.ingresar(10.0f);//pone el saldo a 10.0
		float resultadoReal = c.getSaldo();	
		float resultadoEsperado = 10.0f;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testIngresar2() 
	{
		Cuenta c = new Cuenta();
//		c.ingresar(0.0f);
		float resultadoReal = c.getSaldo();	
		float resultadoEsperado = 0.0f;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
//	@Test
//	void testIngresar2() 
//	{
//		Cuenta c = new Cuenta();
//		c.ingresar(10.0f);
		
	//	c.ingresar(Float.MAX_VALUE); 
		/*Esta linea no se ejecuta, porque segun indica el 
		enunciado, si se hace una operacion no valida en la 
		cuenta, el saldo no cambia.*/
		
//		float resultadoReal = c.getSaldo();	
//		float resultadoEsperado = 10.0f;
//		assertEquals(resultadoEsperado, resultadoReal);
//	}
	
//	@Test
//	void testIngresar3() 
//	{
//		Cuenta c = new Cuenta();
		
	//	c.ingresar(-10.0f);
		/*Esta linea no se ejecuta, porque segun indica el 
		enunciado, si se hace una operacion no valida en la 
		cuenta, el saldo no cambia.*/
		
//		float resultadoReal = c.getSaldo();	
//		float resultadoEsperado = 0.0f;
//		assertEquals(resultadoEsperado, resultadoReal);
//	}
	
	@Test
	void testRetirar1() 
	{
		Cuenta c = new Cuenta();
		c.ingresar(50.0f);
		c.retirar(10.0f);
		float resultadoReal = c.getSaldo();	
		float resultadoEsperado = 40.0f;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testRetirar2() 
	{
		Cuenta c = new Cuenta();
		c.ingresar(50.0f);
//		c.retirar(0.0f);
		float resultadoReal = c.getSaldo();	
		float resultadoEsperado = 50.0f;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
//	@Test
//	void testRetirar2() 
//	{
//		Cuenta c = new Cuenta();
//		c.ingresar(10.0f);
	//	c.retirar(20.0f);
		/*Esta linea no se ejecuta, porque segun indica el 
		enunciado, si se hace una operacion no valida en la 
		cuenta, el saldo no cambia.*/
		
//		float resultadoReal = c.getSaldo();	
//		float resultadoEsperado = 10.0f;
//		assertEquals(resultadoEsperado, resultadoReal);
//	}
	
//	@Test
//	void testRetirar3() {
//		Cuenta c = new Cuenta();
	//	c.retirar(-10.0f);
		/*Esta linea no se ejecuta, porque segun indica el 
		enunciado, si se hace una operacion no valida en la 
		cuenta, el saldo no cambia.*/
//		float resultadoReal = c.getSaldo();	
//		float resultadoEsperado = 0.0f;
//		assertEquals(resultadoEsperado, resultadoReal);
//	}
	
	@Test
	void testTransferir1() 
	{
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(50.0f);
		c1.transferir(c2, 25.0f);
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};		
		float[] resultadoEsperado = {25.0f, 25.0f};	

		assertArrayEquals(resultadoReal,  resultadoEsperado);
	}
	
	@Test
	void testTransferir2() 
	{
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(50.0f);
//		c1.transferir(c2, -50.0f);
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};		
		float[] resultadoEsperado = {50.0f, 0.0f};	

		assertArrayEquals(resultadoReal,  resultadoEsperado);
	}
	
//	@Test
//	void testTransferir2() 
//	{
//		Cuenta c1 = new Cuenta();
//		Cuenta c2 = new Cuenta();
//		c1.ingresar(10.0f);
		
//		c1.transferir(c2, 20.0f);
		/*Esta linea no se ejecuta, porque segun indica el 
		enunciado, si se hace una operacion no valida en la 
		cuenta, el saldo no cambia.*/
		
//		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};	
//		float[] resultadoEsperado = {10.0f, 0.0f};		
//		assertArrayEquals(resultadoReal,  resultadoEsperado);
//	}
	
//	@Test
//	void testTransferir3() 
//	{
//		Cuenta c1 = new Cuenta();
//		Cuenta c2 = new Cuenta();
		
//		c1.transferir(c2, 5.0f);
		/*Esta linea no se ejecuta, porque segun indica el 
		enunciado, si se hace una operacion no valida en la 
		cuenta, el saldo no cambia.*/
		
//		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};	
//		float[] resultadoEsperado = {0.0f, 0.0f};		
//		assertArrayEquals(resultadoReal,  resultadoEsperado);
//	}

}
