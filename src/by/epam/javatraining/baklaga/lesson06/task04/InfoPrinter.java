package by.epam.javatraining.baklaga.lesson06.task04;

public class InfoPrinter {
    public static void printInfo(int number, boolean allEvenOrOdd) {
        System.out.printf("\nAll digits of number %d %s\n", number, allEvenOrOdd ? "have the same parity"
                : "don't have the same parity");
    }
}
