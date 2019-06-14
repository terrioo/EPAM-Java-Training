package by.epam.javatraining.baklaga.lesson06.task04;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberLogicTest {

    @Test
    public void isNumberEven() {
        int number = 88_888;
        boolean expected = true;
        assertEquals(expected, EvenNumberLogic.isNumberEven(number));
    }

    @Test
    public void isNumberOdd() {
        int number = 1_372_847;
        boolean expected = false;
        assertEquals(expected, EvenNumberLogic.isNumberOdd(number));
    }

    @Test
    public void isAllNumbersEvenOrOdd() {
        int number = 288_644;
        boolean expected = true;
        assertEquals(expected, EvenNumberLogic.isAllNumbersEvenOrOdd(number));
    }
    
    @Test
    public void isAllNumbersEvenOrOddZero() {
        int number = 0;
        boolean expected = false;
        assertEquals(expected, EvenNumberLogic.isAllNumbersEvenOrOdd(number));
    }
}
