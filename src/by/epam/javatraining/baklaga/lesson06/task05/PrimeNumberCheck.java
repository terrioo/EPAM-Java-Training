package by.epam.javatraining.baklaga.lesson06.task05;

public class PrimeNumberCheck {
    public static boolean isNumberPrime(int number) {
        if (number > 0) {
            int numberEqual = number;
            int startingPoint = 0;
            while (startingPoint < number && numberEqual > 2) {
                if ((number % (numberEqual - 1)) == 0) {
                    return false;
                }
                numberEqual--;
                startingPoint++;
            }
        }
        return true;
    }
}