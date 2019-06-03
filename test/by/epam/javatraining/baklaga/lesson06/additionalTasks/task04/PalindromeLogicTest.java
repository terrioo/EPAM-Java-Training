package by.epam.javatraining.baklaga.lesson06.additionalTasks.task04;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLogicTest {

    @Test
    public void findPalindrome() {
        int number = 112211;
        int exprected = 112211;
        assertEquals(exprected, PalindromeLogic.findPalindrome(number));
    }

    @Test
    public void isPalindrome() {
        int number = 11268211;
        boolean expected = false;
        assertEquals(expected, PalindromeLogic.isPalindrome(number));
    }
}