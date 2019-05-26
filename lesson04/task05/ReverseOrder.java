package lesson04.task05;

public class ReverseOrder {
    public static int reverse(int number) {
        int number1 = number / 1_000_000;
        int number2 = number / 100_000 % 10;
        int number3 = number / 10_000 % 10;
        int number4 = number / 1_000 % 10;
        int number5 = number / 100 % 10;
        int number6 = number / 10 % 10;
        int number7 = number % 10;
        return number7 * 1_000_000 + number6 * 100_000 + number5 * 10_000 + number4 * 1_000 + number3 * 100 + number2 * 10 + number1;
    }
}
