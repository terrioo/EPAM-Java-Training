package by.epam.javatraining.baklaga.lesson06.task03;

public class FactorialLogic {
    public static int factorial;

    public static int findFactorial(int number) {
        if (number >= 0) {
            factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= number;
                number -= 1;
            }
        }
        return factorial;
    }
}
