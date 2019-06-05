package by.epam.javatraining.baklaga.lesson05.task02;

public class Vowel {
   public static void main(String[] args) {
        char letter = 'o';
        LetterInfo.print(letter, VowelCheck.isVowel(letter));
        LetterInfo.print(letter, VowelCheck.isVowel1(letter));
        LetterInfo.print(letter, VowelCheck.isVowel2(letter));
        LetterInfo.print(letter, VowelCheck.isVowel3(letter));
        LetterInfo.print(letter, VowelCheck.isVowel4(letter));
        LetterInfo.print(letter, VowelCheck.isVowel5(letter));
        LetterInfo.print(letter, VowelCheck.isVowel6(letter));
        LetterInfo.print(letter, VowelCheck.isVowel7(letter));
        LetterInfo.print(letter, VowelCheck.isVowel8(letter));
    }
}
