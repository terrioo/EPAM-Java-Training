package lesson04.task04;

public class Number {
    public static void main(String[] args) {
        int number = 342482;
        int number1 = number / 100_000;
        int number2 = number / 10_000 % 10;
        int number3 = number / 1_000 % 10;
        int number4 = number / 100 % 10;
        int number5 = number / 10 % 10;
        int number6 = number % 10;
        double arithmeticAverageNumber = NumberOperation.calculateArithmeticAverage(number1, number2,
                number3, number4, number5, number6);
        double geometricalAverageNumber = NumberOperation.calculateGeometricalAverage(number1, number2,
                number3, number4, number5, number6);
        PrintAverage.ArithmeticAverage(number, arithmeticAverageNumber);
        PrintAverage.GeometricalAverage(number, geometricalAverageNumber);
    }
}
