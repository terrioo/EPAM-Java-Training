package by.epam.javatraining.baklaga.lesson05.task01;
public class CountOfHeadsAndEyesOfDragon {
    private static final int HEADS_COUNT_AT_BIRTH = 3;    // count of heads at birth;
    private static final int FIRST_LIFE_PERIOD = 200;     // years;
    private static final int SECOND_LIFE_PERIOD = 300;    // years;
    private static final int HEADS_IN_FIRST_PERIOD = 3;   // head growth every year during this period;
    private static final int HEADS_IN_SECOND_PERIOD = 2;  // head growth every year between the first and second period;
    private static final int EYES_COUNT = 2;


    public static int calculateHeads(int age) {
        if (age >= 0) {
            if (age <= FIRST_LIFE_PERIOD) {
                return HEADS_COUNT_AT_BIRTH + age * HEADS_IN_FIRST_PERIOD;
            } else if (age > FIRST_LIFE_PERIOD && age <= SECOND_LIFE_PERIOD) {
                return HEADS_COUNT_AT_BIRTH + FIRST_LIFE_PERIOD * HEADS_IN_FIRST_PERIOD
                        + (age - FIRST_LIFE_PERIOD) * HEADS_IN_SECOND_PERIOD;
            } else if (age > SECOND_LIFE_PERIOD) {
                return HEADS_COUNT_AT_BIRTH + FIRST_LIFE_PERIOD * HEADS_IN_FIRST_PERIOD + (SECOND_LIFE_PERIOD
                        - FIRST_LIFE_PERIOD) * HEADS_IN_SECOND_PERIOD + (age - SECOND_LIFE_PERIOD);
            }
        }
        return 0;
    }

    public static int calculateEyes(int age) {
        return calculateHeads(age) * EYES_COUNT;
    }
}