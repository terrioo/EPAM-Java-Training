package by.epam.javatraining.baklaga.lesson06.task03;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = FactorialLogic.findFactorial(number);
        Printer.print(number, factorial);
    }
}
