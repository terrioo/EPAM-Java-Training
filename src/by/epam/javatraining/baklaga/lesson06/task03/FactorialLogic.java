package by.epam.javatraining.baklaga.lesson06.task03;

public class FactorialLogic {
    public static int findFactorial(int number) {
        int factorial;
        if (number < 0) {
            factorial = 0;
        }
        factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
