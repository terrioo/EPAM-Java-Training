package by.epam.javatraining.baklaga.maintask01;

import java.util.Random;

import org.apache.log4j.Logger;

public class Initializer {
    private static final Logger LOGGER = Logger.getRootLogger();
    public static final Random random = new Random();
    public static final int RANDOM_INDICATOR = 16;
    // Fill the array with random values;
    public static double[] fillArray(double[] vector) {
        LOGGER.debug("Fill the array with random values");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(RANDOM_INDICATOR);
        }
        return vector;
    }
}
