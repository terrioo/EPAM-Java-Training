package by.epam.javatraining.baklaga.lesson06.additionalTasks.task07;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberLogicTest {

    @Test
    public void findSumOfDividers() {
        int number = 496;
        int expected = 496;
        assertEquals(expected, PerfectNumberLogic.findSumOfDividers(number));
    }

    @Test
    public void isNumberPerfect() {
        int number = 28;
        boolean expected = true;
        assertEquals(expected, PerfectNumberLogic.isNumberPerfect(number));
    }
}