package by.epam.javatraining.baklaga.lesson06.additionalTasks.task01;

public class CheckNumber {
    private static int countNumberEven = 0;
    private static int countNumberOdd = 0;

    public static int isNumberEven(int number) {
        number = Math.abs(number);
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                countNumberEven++;
            }
            number /= 10;
        }
        return countNumberEven;
    }

    public static int isNumberOdd(int number) {
        number = Math.abs(number);
        while (number > 0) {
            if (number % 10 % 2 != 0) {
                countNumberOdd++;
            }
            number /= 10;
        }
        return countNumberOdd;
    }
}