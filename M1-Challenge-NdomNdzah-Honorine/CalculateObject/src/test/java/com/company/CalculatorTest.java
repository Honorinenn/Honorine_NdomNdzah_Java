package com.company;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddInt() {

        assertEquals(8, calc.add(6, 2));
        assertEquals(119, calc.add(80, 39));
        assertEquals(20, calc.add(10, 10));
    }

    @Test
    public void shouldSubtractInt() {

        assertEquals(3, calc.subtract(6, 3));
        assertEquals(41, calc.subtract(80, 39));
        assertEquals(10, calc.subtract(30, 20));
    }

    @Test
    public void shouldMultiplyInt() {
        assertEquals(-12, calc.multiply(6, -2));
        assertEquals(78, calc.multiply(2, 39));
        assertEquals(40, calc.multiply(4, 10));
    }

    @Test
    public void shouldDivideInt() {
        assertEquals(2, calc.divide(10, 5));
        assertEquals(3, calc.divide(9, 3));
        assertEquals(3, calc.divide(27, 9));
    }

    @Test
    public void shouldAddDouble() {

        assertEquals(10.8, calc.add(8.4, 2.4), 0.05);
        assertEquals(12.5, calc.add(8.6, 3.9), 0.05);
        assertEquals(20.7, calc.add(10.5, 10.2), 0.05);
    }

    @Test
    public void shouldSubtractDouble() {

        assertEquals(3.7, calc.subtract(8.4, 4.7), 0.05);
        assertEquals(0.9, calc.subtract(5.2, 4.3), 0.05);
        assertEquals(2.3, calc.subtract(4.4, 2.1), 0.05);
    }

    @Test
    public void shouldMultiplyDouble() {
        assertEquals(14.03, calc.multiply(6.1, 2.3), 0.05);
        assertEquals(16.38, calc.multiply(4.2, 3.9), 0.05);
        assertEquals(111.3, calc.multiply(10.5, 10.6),0.05);
    }

    @Test
    public void shouldDivideDouble() {
        assertEquals(2.75, calc.divide(8.8, 3.2), 0.05);
        assertEquals( 7.64, calc.divide(8.4, 1.1), 0.05);
        assertEquals(5.21, calc.divide(12.5, 2.4), 0.05);
    }

}








//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @Test
//    public void add() {
//    }
//
//    @Test
//    public void subtract() {
//    }
//
//    @org.junit.Test
//    public void multiply() {
//    }
//
//    @org.junit.Test
//    public void divide() {
//    }
//
//    @org.junit.Test
//    public void testAdd() {
//    }
//
//    @org.junit.Test
//    public void testSubtract() {
//    }
//
//    @org.junit.Test
//    public void testMultiply() {
//    }
//
//    @org.junit.Test
//    public void testDivide() {
//    }
//}