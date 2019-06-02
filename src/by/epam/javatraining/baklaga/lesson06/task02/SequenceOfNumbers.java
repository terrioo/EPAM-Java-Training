package by.epam.javatraining.baklaga.lesson06.task02;

public class SequenceOfNumbers {
    public static void main(String[] args) {
        int number = 976_531;
        boolean rise = NumberCheck.isSequenceRise(number);
        boolean down = NumberCheck.isSequenceDown(number);
        Printer.print(number, rise, down);
    }
}
