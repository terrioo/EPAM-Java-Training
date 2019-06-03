package by.epam.javatraining.baklaga.lesson06.additionalTasks.task06;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNumberLogicTest {

    @Test
    public void searchMaxNumber() {
        int number = 142957729;
        int expected = 9;
        assertEquals(expected, MaxNumberLogic.searchMaxNumber(number));
    }
}