package by.epam.javatraining.baklaga.lesson06.additionalTasks.task05;

public class CheckNumbers {
    public static boolean isNumbersIdentical(int number) {
        number = Math.abs(number);
        int lastNumber = number % 10;
        number /= 10;
        while (number > 0) {
            int previousNumber = number % 10;
            if (lastNumber != previousNumber) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
