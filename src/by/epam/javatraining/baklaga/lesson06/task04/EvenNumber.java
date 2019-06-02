package by.epam.javatraining.baklaga.lesson06.task04;

public class EvenNumber {
    public static void main(String[] args) {
        int number = 1559;
        boolean allEvenOrOdd = EvenNumberLogic.isAllNumbersEvenOrOdd(number);
        InfoPrinter.printInfo(number, allEvenOrOdd);
    }
}
