package by.epam.javatraining.baklaga.lesson06.task01;

public class Info {
    public static void print(int count, int countHeads, int countTails) {
        if (count > 0) {
            System.out.printf("You throw a coin %d times, heads was %d times, tails - %d times", count,
                    countHeads, countTails);
        } else if (count == 0) {
            System.out.println("Throw a coin! You didn't do it");
        } else System.out.println("Error! You must throw a coin one or more times");
    }
}
