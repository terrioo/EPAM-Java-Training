package lesson04new.task04;

public class Number {
    public static void main(String[] args) {
        int number = 342_482;
        NumberOperation.searchNumbers(number);
        double arithmeticAverageNumber = NumberOperation.calculateArithmeticAverage();
        double geometricalAverageNumber = NumberOperation.calculateGeometricalAverage();
        PrintAverage.ArithmeticAverage(number, arithmeticAverageNumber);
        PrintAverage.GeometricalAverage(number, geometricalAverageNumber);
    }
}
