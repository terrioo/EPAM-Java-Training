package by.epam.javatraining.baklaga.lesson05.task03;


public class MoodSensor {
    public static String showMyMood(int moodIndicator) {
        switch (moodIndicator) {
            case 0:
                return ":(";
            case 1:
                return ":|";
            case 2:
                return ":)";
            default:
                return "(-_-)";
        }
    }
}
