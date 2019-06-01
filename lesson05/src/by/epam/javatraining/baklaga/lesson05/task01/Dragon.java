package by.epam.javatraining.baklaga.lesson05.task01;

public class Dragon {
    public static void main(String[] args) {
        int age = 20;
        int head = CountOfHeadsAndEyesOfDragon.calculateHeads(age);
        int eye = CountOfHeadsAndEyesOfDragon.calculateEyes(age);
        View.print(age, head, eye);

    }
}
