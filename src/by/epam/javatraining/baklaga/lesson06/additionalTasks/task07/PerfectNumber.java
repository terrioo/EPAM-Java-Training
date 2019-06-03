package by.epam.javatraining.baklaga.lesson06.additionalTasks.task07;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        boolean isNumberPerfect = PerfectNumberLogic.isNumberPerfect(number);
        InfoPrinter.printInfo(number, isNumberPerfect);
    }
}

