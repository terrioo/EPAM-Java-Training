package by.epam.javatraining.baklaga.lesson06.additionalTasks.task04;

public class InfoPrinter {
    public static void printInfo(int number, boolean isNumberPerfect) {
        if (number > 0) {
            System.out.printf("\nNumber %d is %s\n", number, isNumberPerfect ? "palindromer"
                    : "not palindromer");
        } else {
            System.out.println("Error! Number must be more than 0.");
        }
    }
}
