package by.epam.javatraining.baklaga.lesson06.task05;

public class PrimeNumberCheck {
    public static boolean isNumberPrime(int number) {
        boolean result = true;
        if (number > 0) {
            int numberEqual = number;
            int startingPoint = 0;
            while (startingPoint < number && numberEqual > 2) {
                if ((number % (numberEqual - 1)) == 0) {
                    result = false;
                }
                numberEqual--;
                startingPoint++;
            }
        } else result = false;
        return result;
    }
}
