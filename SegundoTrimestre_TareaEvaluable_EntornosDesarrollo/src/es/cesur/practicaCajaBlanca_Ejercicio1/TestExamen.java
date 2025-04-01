package es.cesur.practicaCajaBlanca_Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExamen {

	@Test
    public void testMensajeEdad18() {
        String resultadoReal = Examen.mensaje(18);
        String resultadoEsperado = "Ya eres mayor de edad";
        
        assertEquals(resultadoReal, resultadoEsperado);
    }
    
    @Test
    public void testMensajeEdad67() {
        String resultadoReal = Examen.mensaje(67);
        String resultadoEsperado = "Ya puedes jubilarte";
        
        assertEquals(resultadoReal, resultadoEsperado);
    }
    
    @Test
    public void testMensajeOtraEdad() {
        String resultadoReal = Examen.mensaje(29);
        String resultadoEsperado = "No pasa nada";
        
        assertEquals(resultadoReal, resultadoEsperado);
    }
    
    @Test
    public void testValidarDNILargo() {
        boolean resultadoReal = Examen.validar("123456789");
        boolean resultadoEsperado = true;
        
        assertEquals(resultadoReal, resultadoEsperado);
    }
    
    @Test
    public void testValidarDNICorto() {
        boolean resultadoReal = Examen.validar("1234");
        boolean resultadoEsperado = false;
        
        assertEquals(resultadoReal, resultadoEsperado);
    }
}

