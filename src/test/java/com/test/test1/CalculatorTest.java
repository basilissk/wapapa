package com.test.test1;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void isTwoPlusThreeEqualsFive(){

        assertEquals(5, calculator.addTwoNumbers(2, 3));
    }
    @Test
    public void isSevenMinusFourEqualsThree(){

        assertEquals(3, calculator.substractTwoNumbers(7, 4));
    }
    @Test
    public void isThreeMultiplyFourEqualsTwelve(){
        assertEquals(12, calculator.miltiplicateTwoNumbers(3, 4));
    }
    @Test
    public void isOneHundredDivideTwoEqualsFifteen(){
        assertEquals(50, calculator.divideTwoNumbers(100, 2), 0.000001);
        @Test
    public void isEightDivideTwoEqualsFour(){
        assertEquals(4, calculator.divideTwoNumbers(8, 2), 0.000001);
        @Test
    public void isSixteenDivideTwoEqualsThirteen(){
        assertEquals(30, calculator.divideTwoNumbers(60, 2), 0.000001);
        @Test
    public void isForteenDivideTwoEqualsSeven(){
        assertEquals(7, calculator.divideTwoNumbers(14, 2), 0.000001);
    }
}
