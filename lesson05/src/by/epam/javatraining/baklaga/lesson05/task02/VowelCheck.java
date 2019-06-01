package by.epam.javatraining.baklaga.lesson05.task02;

public class VowelCheck {
    public static boolean isVowel(char letter) {
        char letterLowerCase = Character.toLowerCase(letter);
        boolean result = false;
        switch (letterLowerCase) {
            // latin letters
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                // cyrillic letters
            case 'а':
            case 'у':
            case 'о':
            case 'ы':
            case 'и':
            case 'э':
            case 'я':
            case 'ю':
            case 'ё':
            case 'е':
                result = true;
        }
        return result;
    }
}
