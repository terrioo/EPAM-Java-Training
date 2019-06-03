package by.epam.javatraining.baklaga.lesson06.additionalTasks.task01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberTest {

    @Test
    public void isNumberEven() {
        int number = 56_388_679;
        int expected = 4;
        assertEquals(expected, CheckNumber.isNumberEven(number));

    }

    @Test
    public void isNumberOdd() {
        int number = 56_388_679;
        int expected = 4;
        assertEquals(expected, CheckNumber.isNumberOdd(number));
    }
}