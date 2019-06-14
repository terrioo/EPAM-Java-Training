package by.epam.javatraining.baklaga.lesson06.task02;

public class NumberCheck {
    public static boolean isSequenceRise(int number) {
        boolean rise = true;
        if (number != 0) {
            number = Math.abs(number);
            int lastNumber = number % 10;

            while ((number /= 10) > 0) {
                int previousNumber = number % 10;
                if (lastNumber > previousNumber) {
                    lastNumber = previousNumber;
                } else {
                    rise = false;
                    break;
                }
            }
        } else rise = false;
        return rise;
    }

    public static boolean isSequenceDown(int number) {
        boolean down = true;
        if (number != 0) {
            number = Math.abs(number);
            int lastNumber = number % 10;

            while ((number /= 10) > 0) {
                int previousNumber = number % 10;
                if (lastNumber < previousNumber) {
                    lastNumber = previousNumber;
                } else {
                    down = false;
                    break;
                }
            }
        } else down = false;
        return down;
    }
}
