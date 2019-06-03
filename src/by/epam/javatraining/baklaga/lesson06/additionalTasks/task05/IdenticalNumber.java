package by.epam.javatraining.baklaga.lesson06.additionalTasks.task05;

public class IdenticalNumber {
    public static void main(String[] args) {
        int number = 66666;
        boolean indicator = CheckNumbers.isNumbersIdentical(number);
        InfoPrinter.print(number, indicator);
    }
}
