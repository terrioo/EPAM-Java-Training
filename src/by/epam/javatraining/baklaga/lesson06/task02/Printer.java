package by.epam.javatraining.baklaga.lesson06.task02;

public class Printer {
    public static void print(int number, boolean rise, boolean down) {
        if (rise == true) {
            System.out.printf("\nNumbers of number %d forms an increasing sequence\n", number);
        } else if (down == true) {
            System.out.printf("\nNumbers of number %d forms an decreasing sequence\n", number);
        } else
            System.out.printf("\nNumbers of number %d  do not form a sequence\n", number);
    }
}
