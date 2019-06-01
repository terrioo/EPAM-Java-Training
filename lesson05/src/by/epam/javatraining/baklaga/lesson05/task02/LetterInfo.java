package by.epam.javatraining.baklaga.lesson05.task02;

public class LetterInfo {
    public static void print(char letter, boolean result) {
        System.out.printf("Symbol %c is %s \n", letter, (result == true ? "vowel" : "not vowel"));
    }
}
