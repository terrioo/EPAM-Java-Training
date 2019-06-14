package by.epam.javatraining.baklaga.lesson06.task05;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberCheckTest {

    @Test
    public void isNumberPrimeTrue() {
        int number = 151;
        boolean expected = true;
        assertEquals(expected, PrimeNumberCheck.isNumberPrime(number));
    }

    @Test
    public void isNumberPrimeWrong() {
        int number = 55;
        boolean expected = false;
        assertEquals(expected, PrimeNumberCheck.isNumberPrime(number));
    }

    @Test
    public void isNumberPrimeZero() {
        int number = 0;
        boolean expected = false;
        assertEquals(expected, PrimeNumberCheck.isNumberPrime(number));
    }

    @Test
    public void isNumberPrimeNegative() {
        int number = -40;
        boolean expected = false;
        assertEquals(expected, PrimeNumberCheck.isNumberPrime(number));
    }
}
