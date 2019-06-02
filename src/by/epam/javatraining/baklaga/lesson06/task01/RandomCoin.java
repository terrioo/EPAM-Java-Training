package by.epam.javatraining.baklaga.lesson06.task01;

import java.util.Random;

public class RandomCoin {
    private static Random random = new Random();
    private static int countHeads = 0;
    private static int countTails = 0;
    final private static int SIDES = 2; // 0 - heads, 1 - tails;

    public static int throwCoinFindHeads(int count) {
        if (count > 0) {
            for (int i = 0; i <= count; i++) {
                int indicator = random.nextInt(SIDES);
                if (indicator == 0) countHeads++;
            }
        }
        return countHeads;
    }

    public static int FindTails(int count, int countHeads) {
        if (count > 0) {
            countTails = count - countHeads;
        }
        return countTails;
    }
}
