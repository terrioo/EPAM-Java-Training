package lesson04new.task01;

public class DataOutput {
    public static void print(double a, double b, double c) {
        System.out.printf("Are the numbers %.3f, %.3f, %.3f equal? --> %s\n", a, b, c,
                (NumberComparator.compareNumbers(a, b, c) == true ? "Numbers are equal" : "Numbers are different"));
    }
}
