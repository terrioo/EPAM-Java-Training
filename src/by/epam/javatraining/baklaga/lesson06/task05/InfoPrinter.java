package by.epam.javatraining.baklaga.lesson06.task05;

public class InfoPrinter {
    public static void printInfo(int number, boolean prime) {
        if (number > 0) {
            System.out.printf("\nNumber %d is %s\n", number, prime ? "prime number"
                    : "not prime number");
        } else {
            System.out.println("Error! Number must be more than 0.");
        }
    }
}
