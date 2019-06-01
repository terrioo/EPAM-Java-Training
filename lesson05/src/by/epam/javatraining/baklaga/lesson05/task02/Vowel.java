package by.epam.javatraining.baklaga.lesson05.task02;

public class Vowel {
    public static void main(String[] args) {
        char letter = 'я';
        LetterInfo.print(letter, VowelCheck.isVowel(letter));
    }
}
