package lesson04.task03;

public class Check {
    public static boolean checkNumbers(int a) {
        int number1 = a / 1000;
        int number2 = a / 100 % 10;
        int number3 = a / 10 % 10;
        int number4 = a % 10;
        return (number1 < number2 && number2 < number3 && number3 < number4) || (number1 > number2 && number2 > number3 && number3 > number4);

    }
}
