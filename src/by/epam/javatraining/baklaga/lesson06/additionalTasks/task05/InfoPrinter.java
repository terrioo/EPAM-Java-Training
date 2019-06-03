package by.epam.javatraining.baklaga.lesson06.additionalTasks.task05;

public class InfoPrinter {
    public static void print(int number, boolean indicator) {
        System.out.printf("\nAll digits of number %d %s ", number, indicator ? "are identical" : "aren't identical");
    }
}
