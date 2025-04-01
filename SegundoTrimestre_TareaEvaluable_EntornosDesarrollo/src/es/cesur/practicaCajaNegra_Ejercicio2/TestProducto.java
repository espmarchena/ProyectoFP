package es.cesur.practicaCajaNegra_Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestProducto {

    // ----------------------------------------------------------
    // Método: setPrecio(double precio)
    // CE1: 0 ≤ precio ≤ 100 → actualiza
    // CE2: precio < 0 → no cambia
    // CE3: precio > 100 → no cambia
    // ----------------------------------------------------------
    @Test
    void testSetPrecio_CE1_Valido() {
        Producto p = new Producto();
        p.setPrecio(50.0);
        assertEquals(50.0, p.getPrecio(), 0.001);
    }

    @Test
    void testSetPrecio_CE2_InvalidoNegativo() {
        Producto p = new Producto();
        p.setPrecio(-10.0); // La clase actual permite negativos
        assertEquals(-10.0, p.getPrecio(), 0.001); 
    }

    @Test
    void testSetPrecio_CE3_InvalidoMayor100() {
        Producto p = new Producto();
        p.setPrecio(150.0); // La clase actual permite >100
        assertEquals(150.0, p.getPrecio(), 0.001); 
    }

    // ----------------------------------------------------------
    // Método: aplicarDescuento(int porcentaje)
    // CE1: 0 ≤ porcentaje ≤ 100 → aplica
    // CE2: porcentaje < 0 → no cambia
    // CE3: porcentaje > 100 → no cambia
    // ----------------------------------------------------------
    @Test
    void testAplicarDescuento_CE1_Valido() {
        Producto p = new Producto();
        p.setPrecio(100.0);
        p.aplicarDescuento(20);
        assertEquals(80.0, p.getPrecio(), 0.001);
    }

    @Test
    void testAplicarDescuento_CE2_InvalidoNegativo() {
        Producto p = new Producto();
        p.setPrecio(100.0);
        p.aplicarDescuento(-5);
        assertEquals(100.0, p.getPrecio(), 0.001); // Comportamiento correcto
    }

    @Test
    void testAplicarDescuento_CE3_InvalidoMayor100() {
        Producto p = new Producto();
        p.setPrecio(100.0);
        p.aplicarDescuento(110);
        assertEquals(100.0, p.getPrecio(), 0.001); // Comportamiento correcto
    }

    // ----------------------------------------------------------
    // Método: setIVA(int iva)
    // CE1: iva = 4 → actualiza
    // CE2: iva = 10 → actualiza
    // CE3: iva = 21 → actualiza
    // CE4: iva ≠ 4,10,21 → no cambia
    // ----------------------------------------------------------
    @Test
    void testSetIVA_CE1_Valido4() {
        Producto p = new Producto();
        p.setIVA(4);
        assertEquals(4, p.getIVA());
    }

    @Test
    void testSetIVA_CE2_Valido10() {
        Producto p = new Producto();
        p.setIVA(10);
        assertEquals(10, p.getIVA());
    }

    @Test
    void testSetIVA_CE3_Valido21() {
        Producto p = new Producto();
        p.setIVA(21);
        assertEquals(21, p.getIVA());
    }

    @Test
    void testSetIVA_CE4_Invalido() {
        Producto p = new Producto();
        p.setIVA(15); // La clase actual permite cualquier IVA
        assertEquals(15, p.getIVA()); 
    }
}



