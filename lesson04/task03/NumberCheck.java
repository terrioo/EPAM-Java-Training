package lesson04new.task03;

public class NumberCheck {
    public static void main(String[] args) {
        int a = 1368;
        System.out.printf("Do the numbers of number %d form an ascending (or descending) sequence? --> %s\n", a,
                (Check.checkNumbers(a)) == true ? "Yes" : "No");
    }
}
