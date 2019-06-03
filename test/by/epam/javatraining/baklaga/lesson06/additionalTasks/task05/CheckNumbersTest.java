package by.epam.javatraining.baklaga.lesson06.additionalTasks.task05;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumbersTest {

    @Test
    public void isNumbersIdentical() {
        int number = 44444;
        boolean expected = true;
        assertEquals(expected, CheckNumbers.isNumbersIdentical(number));
    }
}