package by.epam.javatraining.baklaga.lesson06.additionalTasks.task04;

public class PalindromeLogic {
    public static int findPalindrome(int number) {
        String string = "";
        if (number > 0) {
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                string += digit;
            }
        }
        return Integer.parseInt(string);
    }

    public static boolean isPalindrome(int number) {
        return number == findPalindrome(number);
    }
}

