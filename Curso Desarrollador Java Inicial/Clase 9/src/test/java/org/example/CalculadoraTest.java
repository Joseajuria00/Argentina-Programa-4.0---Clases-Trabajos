package org.example;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

    public void testMultiplicar() {
        assertEquals(Calculadora.multiplicar(80,3), 240d);
    }

    public void testSumarDividir(){
        assertEquals(Calculadora.dividir(Calculadora.sumar(150,180),3),110d);
    }

    public void testRestarMultiplicar(){
        assertEquals(Calculadora.multiplicar(Calculadora.restar(90,50),15),605d);
    }

    public void testSumarMultiplicar(){
        assertEquals(Calculadora.multiplicar(Calculadora.sumar(70,40),25),2700d);
    }
}