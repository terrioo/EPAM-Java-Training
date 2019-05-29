package lesson04new.task05;

public class ReverseOrder {
    public static int reverse(int number) {
        int number1 = number % 10;
        number /= 10;
        int number2 = number % 10;
        number /= 10;
        int number3 = number % 10;
        number /= 10;
        int number4 = number % 10;
        number /= 10;
        int number5 = number % 10;
        number /= 10;
        int number6 = number % 10;
        number /= 10;
        int number7 = number % 10;
        return number1 * 1_000_000 + number2 * 100_000 + number3 * 10_000 + number4 * 1_000 + number5 * 100
                + number6 * 10 + number7;
    }

}
