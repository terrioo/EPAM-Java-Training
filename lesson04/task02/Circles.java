package lesson04.task02;

public class Circles {
    public static void main(String[] args) {
        double radius1 = 18.25;
        double radius2 = 7.35;
        System.out.printf("Есть два круга. Радиус 1-го - %.3f см, радиус 2-го - %.3f см.\n", radius1, radius2);
        double square1 = SquareOfCircle.calculateSquare(radius1);
        double square2 = SquareOfCircle.calculateSquare(radius2);
        System.out.printf("Площадь 1-го круга - %.3f см2, площадь 2-го круга - %.3f см2.\n", square1, square2);
        double squareOfRing = SquareOfRing.calculateSquare(square1, square2);
        System.out.printf("Площадь кольца, образованного первым и вторым кругами - %.3f см2.\n", squareOfRing);
    }
}
