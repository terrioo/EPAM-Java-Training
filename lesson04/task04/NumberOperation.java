package lesson04.task04;

public class NumberOperation {

    public static double calculateArithmeticAverage(int number1, int number2, int number3, int number4, int number5, int number6) {
        return (double) (number1 + number2 + number3 + number4 + number5 + number6) / 6;
    }

    public static double calculateGeometricalAverage(int number1, int number2, int number3, int number4, int number5, int number6) {
        return Math.pow((number1 * number2 * number3 * number4 * number5 * number6), (1 / 6.0));
    }

}
