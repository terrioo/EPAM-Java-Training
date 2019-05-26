package lesson03;

// Task2;

public class Exchange {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
    }
}
