package lesson04.task01;

public class DataOutput {
    public static void print(double a, double b) {
        System.out.printf("Are the numbers %.3f, %.3f equal? --> %s\n", a, b,
                (NumberComparator.compareNumbers(a, b) == true ? "Numbers are equal" : "Numbers are different"));
    }
}
