package by.epam.javatraining.baklaga.lesson05.task03;


import java.util.Random;

public class MoodSensor {
    public static final Random random = new Random();
    public static final int MOOD_INDICATOR = 4;
    public static final String SAD = ":(";
    public static final String NEUTRAL = ":|";
    public static final String SO_SO = "(-_-)";
    public static final String SMILE = ":)";

    public static String showMyMood() {
        String mood = NEUTRAL;
        switch (random.nextInt(MOOD_INDICATOR)) {
            case 0:
                mood = SAD;
            case 2:
                mood = SO_SO;
            case 3:
                mood = SMILE;
        }
        return mood;
    }
}
