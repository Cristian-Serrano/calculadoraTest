package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(-1, Calculadora.sumar(-2, 1));
        assertEquals(0, Calculadora.sumar(0, 0));
    }
    /* Realiza a continuación el resto de tests para el resto de funciones */

    @Test
    public void testRestar() {
        assertTrue(Calculadora.restar(20,5) == 15);
        assertTrue(Calculadora.restar(30, 10) == 20);
    }

    @Test
    public void testMultiplicar() {
        assertFalse(Calculadora.multiplicar(10,5) == 100);
        assertFalse(Calculadora.multiplicar(2, 3) == 12);
    }

    @Test
    public void testDividir() {
        assertFalse(Calculadora.dividir(12,5) == 3);
        assertEquals(20, Calculadora.dividir(60,3),0.01);
    }
}