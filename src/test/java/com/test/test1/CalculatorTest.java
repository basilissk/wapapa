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
    public void isThreeMultiplghghourEqualsTwelve(){
        assertEquals(25, calculator.miltiplicateTwoNumbers(5, 5));
        }
    @Test
    public void isThreeMultttphplyFourEqualsTwelve(){
        assertEquals(2, calculator.miltiplicateTwoNumbers(1, 2));
        }
    @Test
    public void isThreeMultiplyFourrjrrjualsTwelve(){
        assertEquals(100, calculator.miltiplicateTwoNumbers(10, 10));
    }
}
