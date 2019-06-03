package by.epam.javatraining.baklaga.lesson06.additionalTasks.task07;

public class PerfectNumberLogic {
    private static int sum = 0;

    public static int findSumOfDividers(int number) {
        if (number > 0) {
            for (int i = 1; i < number - 1; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static boolean isNumberPerfect(int number) {
        return number == findSumOfDividers(number);
    }
}
