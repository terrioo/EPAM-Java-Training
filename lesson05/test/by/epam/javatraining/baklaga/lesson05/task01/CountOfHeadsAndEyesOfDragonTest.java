package by.epam.javatraining.baklaga.lesson05.task01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfHeadsAndEyesOfDragonTest {

    @Test
    public void calculateHeadWrongAge() {
        int age = -10;
        int expected = 0;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateHeads(age));
    }

    @Test
    public void calculateHeadsAtBirth() {
        int age = 0;
        int expected = 3;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateHeads(age));
    }

    @Test
    public void calculateHeadsAtFirstPeriod() {
        int age = 100;
        int expected = 303;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateHeads(age));
    }

    @Test
    public void calculateHeadsBetweenFirstAndSecondPeriod() {
        int age = 250;
        int expected = 703;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateHeads(age));
    }

    @Test
    public void calculateHeadsAtSecondPeriod() {
        int age = 350;
        int expected = 853;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateHeads(age));
    }

    @Test
    public void calculateEyes() {
        int age = 20;
        int expected = 126;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateEyes(age));
    }

    @Test
    public void calculateEyesNegativAge() {
        int age = -20;
        int expected = 0;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateEyes(age));
    }

    @Test
    public void calculateEyesYoung() {
        int age = 0;
        int expected = 6;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateEyes(age));
    }

    @Test
    public void calculateEyesAdult() {
        int age = 250;
        int expected = 1406;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateEyes(age));
    }

    @Test
    public void calculateEyesOld() {
        int age = 350;
        int expected = 1706;
        assertEquals(expected, CountOfHeadsAndEyesOfDragon.calculateEyes(age));
    }
}
