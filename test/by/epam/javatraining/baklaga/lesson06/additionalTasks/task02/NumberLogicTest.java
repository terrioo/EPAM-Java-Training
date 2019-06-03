package by.epam.javatraining.baklaga.lesson06.additionalTasks.task02;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void seachSum() {
        int number = 47219;
        int expected = 23;
        assertEquals(expected, NumberLogic.searchSum(number));
    }
}