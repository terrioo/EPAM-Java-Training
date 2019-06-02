package by.epam.javatraining.baklaga.lesson06.task02;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCheckTest {

    @Test
    public void isSequenceRiseRight() {
        int number = 1369;
        boolean expected = true;
        assertEquals(expected, NumberCheck.isSequenceRise(number));
    }

    @Test
    public void isSequenceRiseWrong() {
        int number = 848_327;
        boolean expected = false;
        assertEquals(expected, NumberCheck.isSequenceRise(number));
    }

    @Test
    public void isSequenceDownRight() {
        int number = 987_654_321;
        boolean expected = true;
        assertEquals(expected, NumberCheck.isSequenceDown(number));
    }

    @Test
    public void isSequenceDownWrong() {
        int number = 7_932_694;
        boolean expected = false;
        assertEquals(expected, NumberCheck.isSequenceDown(number));
    }
}