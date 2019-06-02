package by.epam.javatraining.baklaga.lesson06.task02;

public class NumberCheck {
    public static boolean isSequenceRise(int number) {
        boolean rise = true;
        number = Math.abs(number);
        int lastNumber = number % 10;
        number /= 10;

        while (number > 0) {
            int previousNumber = number % 10;
            if (lastNumber > previousNumber) {
                lastNumber = previousNumber;
                number /= 10;
            } else {
                rise = false;
                break;
            }
        }
        return rise;
    }

    public static boolean isSequenceDown(int number) {
        boolean down = true;
        number = Math.abs(number);
        int lastNumber = number % 10;
        number /= 10;

        while (number > 0) {
            int previousNumber = number % 10;
            if (lastNumber < previousNumber) {
                lastNumber = previousNumber;
                number /= 10;
            } else {
                down = false;
                break;
            }
        }
        return down;
    }
}




