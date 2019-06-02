package by.epam.javatraining.baklaga.lesson06.task03;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialLogicTest {

    @Test
    public void findFactorialMistake() {
        int number = -10;
        int expected = 0;
        assertEquals(expected, FactorialLogic.findFactorial(number));
    }

    @Test
    public void findFactorialRight() {
        int number = 6;
        int expected = 720;
        assertEquals(expected, FactorialLogic.findFactorial(number));
    }
}