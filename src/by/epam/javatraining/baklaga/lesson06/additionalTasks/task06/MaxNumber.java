package by.epam.javatraining.baklaga.lesson06.additionalTasks.task06;

public class MaxNumber {
    public static void main(String[] args) {
        int number = 1594389;
        int maxNumber = MaxNumberLogic.searchMaxNumber(number);
        InfoPrinter.printInfo(number, maxNumber);
    }
}
