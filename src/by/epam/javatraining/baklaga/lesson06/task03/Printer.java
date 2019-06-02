package by.epam.javatraining.baklaga.lesson06.task03;

public class Printer {
    public static void print(int number, int factorial) {
        if (number >= 0) {
            System.out.printf("Factorial of natural number %d is %d", number, factorial);
        } else
            System.out.printf("ERROR! %d is not natural number. Natural number must be = or > 0  ", number);
    }
}
