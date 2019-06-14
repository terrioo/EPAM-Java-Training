package by.epam.javatraining.baklaga.lesson06.task01;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomCoinTest {

    @Test
    public void throwCoinFindHeadsMistakeCount() {
        int count = -2;
        int expected = 0;
        assertEquals(expected, RandomCoin.throwCoinFindHeads(count));
    }
    
    @Test
    public void throwCoinFindHeadsCountZero() {
        int count = 0;
        int expected = 0;
        assertEquals(expected, RandomCoin.throwCoinFindHeads(count));
    }

    @Test
    public void findTails() {
        int count = 1000;
        int countHeads = 555;
        int expected = 445;
        assertEquals(expected, RandomCoin.FindTails(count, countHeads));
    }
}
