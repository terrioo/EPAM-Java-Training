package lesson04new.task02;

public class Circles {
    public static void main(String[] args) {
        double radius1 = 18.25;
        double radius2 = 7.35;
        System.out.printf("There are two circles. Radius of the first - %.3f см, radius of the second - %.3f см.\n",
                radius1, radius2);
        double squareOfRing = SquareOfRing.calculateSquare(radius1, radius2);
        System.out.printf("The area of the ring formed by the first and second circles is - %.3f см2.\n", squareOfRing);
    }
}
