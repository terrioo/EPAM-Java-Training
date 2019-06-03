package by.epam.javatraining.baklaga.lesson06.additionalTasks.task02;

public class NumberLogic {
    public static int searchSum(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
