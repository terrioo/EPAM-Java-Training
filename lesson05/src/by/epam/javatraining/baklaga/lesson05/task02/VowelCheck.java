package by.epam.javatraining.baklaga.lesson05.task02;

public class VowelCheck {
    final private static String VOWELS = "a, e, i, o, u, y";
    final private static char[] LETTERS = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static boolean isVowel(char letter) {
        char letterLowerCase = Character.toLowerCase(letter);
        switch (letterLowerCase) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
        }
        return false;
    }

    public static boolean isVowel1(char letter) {
        return "aeiouy".contains(Character.toString(letter).toLowerCase());
    }

    public static boolean isVowel2(char letter) {
        letter = Character.toLowerCase(letter);
        return "aeiouy".contains(Character.toString(letter));
    }

    public static boolean isVowel3(char letter) {
        letter = Character.toLowerCase(letter);
        return "aeiouy".indexOf(letter) != -1;
    }

    static boolean isVowel4(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }

    public static boolean isVowel5(char letter) {
        letter = Character.toLowerCase(letter);
        if (Character.isLetter(letter) && Character.toString(letter).matches("[aeiouy]")) {
            return true;
        }
        return false;
    }

    public static boolean isVowel6(char letter) {
        return VOWELS.indexOf(letter) >= 0;
    }

    public static boolean isVowel7(char letter) {
        letter = Character.toLowerCase(letter);
        //   char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'e', 'y', 'u', 'i', 'o', 'a'};
        for (char vowel : LETTERS) {
            if (vowel == letter) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel8(char letter) {
        //   char check[] = {'a', 'e', 'i', 'o', 'u'};
        letter = Character.toLowerCase(letter);
        for (int i = 0; i < LETTERS.length; i++) {
            if (LETTERS[i] == letter) {
                return true;
            }
        }
        return false;
    }
}
