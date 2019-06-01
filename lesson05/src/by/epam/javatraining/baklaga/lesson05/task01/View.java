package by.epam.javatraining.baklaga.lesson05.task01;

public class View {
    public static void print(int age, int head, int eye) {
        if (head != 0) {
            System.out.printf("Age of the dragon is %d, he has %d heads and %d eyes.\n", age, head, eye);
        } else
            System.out.println("Error! Age can't be less than 0. Enter the age correctly.");
    }
}
