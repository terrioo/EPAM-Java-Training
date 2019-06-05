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
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }

    @Test
    public void isVowelCheck3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel(letter));
    }

    @Test
    public void isVowel1Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel1(letter));
    }

    @Test
    public void isVowel1Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel1(letter));
    }

    @Test
    public void isVowel1Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel1(letter));
    }

    @Test
    public void isVowel2Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel2(letter));
    }

    @Test
    public void isVowel2Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel2(letter));
    }

    @Test
    public void isVowel2Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel2(letter));
    }

    @Test
    public void isVowel3Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel3(letter));
    }

    @Test
    public void isVowel3Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel3(letter));
    }

    @Test
    public void isVowel3Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel3(letter));
    }

    @Test
    public void isVowel4Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel4(letter));
    }

    @Test
    public void isVowel4Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel4(letter));
    }

    @Test
    public void isVowel4Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel4(letter));
    }

    @Test
    public void isVowel5Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel5(letter));
    }

    @Test
    public void isVowel5Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel5(letter));
    }

    @Test
    public void isVowel5Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel5(letter));
    }

    @Test
    public void isVowel6Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel6(letter));
    }

    @Test
    public void isVowel6Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel6(letter));
    }

    @Test
    public void isVowel6Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel6(letter));
    }

    @Test
    public void isVowel7Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel7(letter));
    }

    @Test
    public void isVowel7Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel7(letter));
    }

    @Test
    public void isVowel7Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel7(letter));
    }

    @Test
    public void isVowel8Check1() {
        char letter = 'U';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel8(letter));
    }

    @Test
    public void isVowel8Check2() {
        char letter = 'L';
        boolean expected = false;
        assertEquals(expected, VowelCheck.isVowel8(letter));
    }

    @Test
    public void isVowel8Check3() {
        char letter = 'a';
        boolean expected = true;
        assertEquals(expected, VowelCheck.isVowel8(letter));
    }
}
