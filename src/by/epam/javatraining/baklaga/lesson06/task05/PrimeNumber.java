package by.epam.javatraining.baklaga.lesson06.task05;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 150;
        boolean prime = PrimeNumberCheck.isNumberPrime(number);
        InfoPrinter.printInfo(number, prime);
    }
}
