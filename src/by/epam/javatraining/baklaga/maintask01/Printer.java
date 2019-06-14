package by.epam.javatraining.baklaga.maintask01;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class Printer {
    private static final Logger LOGGER = Logger.getRootLogger();

    public static void printArray(double[] vector) {
        LOGGER.info(Arrays.toString(vector));
    }

    public static void print(String string) {
        LOGGER.info(string);
    }

    public static void printResultOfSearch(int result) {
        if (result == -1) {
            LOGGER.info("The required value is missing");
        } else LOGGER.info("The required value belongs to the vector. It's index is " + result);
    }

    public static void isArraySorted(boolean result) {
        if (result == true) {
            LOGGER.info("Numbers form a sequence");
        } else LOGGER.info("Numbers don't form a sequence");
    }
}
