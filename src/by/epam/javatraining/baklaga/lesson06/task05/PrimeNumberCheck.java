package by.epam.javatraining.baklaga.lesson06.task05;

public class PrimeNumberCheck {
    public static boolean isNumberPrime(int number) {
        double halfNumber = Math.sqrt(number);
        boolean result = true;
        if (number <= 1) {
            result = false;
        }
        for (int i = 2; i < halfNumber; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }
}
