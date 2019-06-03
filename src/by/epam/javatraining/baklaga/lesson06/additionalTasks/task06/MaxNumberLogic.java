package by.epam.javatraining.baklaga.lesson06.additionalTasks.task06;

public class MaxNumberLogic {
    public static int searchMaxNumber(int number) {
        number = Math.abs(number);
        int maxNumber = number % 10;
        number /= 10;
        while (number > 0) {
            int previousNumber = number % 10;
            if (previousNumber > maxNumber) {
                maxNumber = previousNumber;
            }
            number /= 10;
        }
        return maxNumber;
    }
}
