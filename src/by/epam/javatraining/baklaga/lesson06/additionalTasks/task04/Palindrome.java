package by.epam.javatraining.baklaga.lesson06.additionalTasks.task04;

public class Palindrome {
    public static void main(String[] args) {
        int number = 112211;
        boolean isPalindrome = PalindromeLogic.isPalindrome(number);
        InfoPrinter.printInfo(number, isPalindrome);
    }
}
