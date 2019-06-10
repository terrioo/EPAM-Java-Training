package by.epam.javatraining.baklaga.maintask01;

import java.util.Arrays;

public class Printer {
    public static void printArray(double[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void printResultOfSearch(int result) {
        if (result == -1) {
            System.out.println("The required value is missing");
        } else System.out.println("The required value belongs to the vector. It's index is " + result);
    }

    public static void isArraySorted(boolean result) {
        if (result == true) {
            System.out.println("Numbers form a sequence");
        } else System.out.println("Numbers don't form a sequence");

    }
}
