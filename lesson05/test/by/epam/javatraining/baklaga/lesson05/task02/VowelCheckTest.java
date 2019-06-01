package by.epam.javatraining.baklaga.lesson05.task02;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCheckTest {

    @Test
    public void isVowelCheck1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }

    @Test
    public void isVowelCheck2() {
        char letter = 'ю';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }

    @Test
    public void isVowelCheck3() {
        char letter = 'И';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }

    @Test
    public void isVowelCheck4() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }

    @Test
    public void isVowelCheck5() {
        char letter = 'Ь';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }
}