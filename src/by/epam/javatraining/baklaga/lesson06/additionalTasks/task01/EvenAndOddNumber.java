package by.epam.javatraining.baklaga.lesson06.additionalTasks.task01;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int number = 378_949_752;
        int countNumberEven = CheckNumber.isNumberEven(number);
        int countNumberOdd = CheckNumber.isNumberOdd(number);
        InfoPrinter.printInfo(number, countNumberEven, countNumberOdd);
    }
}
