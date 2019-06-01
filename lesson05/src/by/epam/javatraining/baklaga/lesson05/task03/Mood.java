package by.epam.javatraining.baklaga.lesson05.task03;

import java.util.Random;

public class Mood {
    public static void main(String[] args) {
        Random random = new Random();
        int moodIndicator = random.nextInt(3);
        MoodInfo.print(MoodSensor.showMyMood(moodIndicator));
    }
}
