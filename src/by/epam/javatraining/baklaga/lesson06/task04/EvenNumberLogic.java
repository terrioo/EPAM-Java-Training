package by.epam.javatraining.baklaga.lesson06.task04;

public class EvenNumberLogic {
    public static boolean isNumberEven(int number) {
        number = Math.abs(number);
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isNumberOdd(int number) {
        number = Math.abs(number);
        while (number > 0) {
            if (number % 10 % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isAllNumbersEvenOrOdd(int number) {
        if (number == 0) {
            return false;
        } else return isNumberEven(number) || isNumberOdd(number);
    }
}

