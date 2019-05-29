package lesson04new.task03;

public class Check {
    public static boolean checkNumbers(int number) {
        int number1 = number % 10;
        number /= 10;
        int number2 = number % 10;
        number /= 10;
        int number3 = number % 10;
        number /= 10;
        int number4 = number % 10;
        return (number1 < number2 && number2 < number3 && number3 < number4)
                || (number1 > number2 && number2 > number3 && number3 > number4);

    }
}
