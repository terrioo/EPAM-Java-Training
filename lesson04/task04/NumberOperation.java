package lesson04new.task04;

public class NumberOperation {
    private static final int NUMBERCOUNT = 6;
    private static int number1;
    private static int number2;
    private static int number3;
    private static int number4;
    private static int number5;
    private static int number6;

    public static void searchNumbers(int number) {
        number1 = number % 10;
        number /= 10;
        number2 = number % 10;
        number /= 10;
        number3 = number % 10;
        number /= 10;
        number4 = number % 10;
        number /= 10;
        number5 = number % 10;
        number /= 10;
        number6 = number % 10;
    }

    public static double calculateArithmeticAverage() {
        return (double) (number1 + number2 + number3 + number4 + number5 + number6) / NUMBERCOUNT;
    }

    public static double calculateGeometricalAverage() {
        return Math.pow(number1 * number2 * number3 * number4 * number5 * number6, 1.0 / NUMBERCOUNT);
    }

}
