package by.epam.javatraining.baklaga.lesson05.task03;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test
    public void showMyMood1() {
        int moodIndicator = 0;
        String expected = ":(";
        assertEquals(expected, MoodSensor.showMyMood());
    }

    @Test
    public void showMyMood2() {
        int moodIndicator = 1;
        String expected = ":|";
        assertEquals(expected, MoodSensor.showMyMood());
    }

    @Test
    public void showMyMood3() {
        int moodIndicator = 2;
        String expected = "(-_-)";
        assertEquals(expected, MoodSensor.showMyMood());
    }

    @Test
    public void showMyMood4() {
        int moodIndicator = 3;
        String expected = ":)";
        assertEquals(expected, MoodSensor.showMyMood());
    }

    @Test
    public void showMyMood5() {
        int moodIndicator = 77;
        String expected = ":|";
        assertEquals(expected, MoodSensor.showMyMood());
    }
}
}
