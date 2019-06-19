package by.epam.javatraining.baklaga.maintask01;


import org.apache.log4j.Logger;

public class VectorLogic {
    private static final Logger LOGGER = Logger.getRootLogger();
    public static final int NO_RESULT = -1;
    public static final int HALF = 2;


    // Check is vector null array or not;
    public static void checkNull(double[] vector) throws NullArrayException {
        LOGGER.debug("Check is vector null array or not");
        if (vector == null || vector.length == 0) {
            throw new NullArrayException("Vector can't be null. It's length must be greater than 0.");
        }
    }

    // Swapping elements of array;
    private static void exchangeElements(double[] vector, int index1, int index2) {
        double newValue = vector[index1];
        vector[index1] = vector[index2];
        vector[index2] = newValue;
    }

    // Find the maximum value of vector;
    public static double findMaxValue(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Find the maximum value of vector");
        double max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            LOGGER.trace("Find the maximum value of vector. Iteration step: " + i);
            max = max < vector[i] ? vector[i] : max;
        }
        return max;
    }

    // Find the minimum value of vector;
    public static double findMinValue(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Find the minimum value of vector");
        double min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            LOGGER.trace("Find the minimum value of vector. Iteration step: " + i);
            min = min > vector[i] ? vector[i] : min;
        }
        return min;
    }

    // Find arithmetic average;
    public static double calculateArithmeticAverage(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Find arithmetic average");
        double sumOfValues = 0;
        for (int i = 0; i < vector.length; i++) {
            LOGGER.trace("Find arithmetic average. Iteration step: " + i);
            sumOfValues += vector[i];
        }
        return sumOfValues /= vector.length;
    }

    // Find geometric mean;
    public static double calculateGeometricMean(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Find geometric mean");
        double multiplication = 1.0;
        double geometricMean;
        for (int i = 0; i < vector.length; i++) {
            LOGGER.trace("Find geometric mean. Iteration step: " + i);
            if (vector[i] <= 0) {
                geometricMean = NO_RESULT;
                break;
            }
            multiplication *= vector[i];
        }
        geometricMean = Math.pow(multiplication, 1.0 / vector.length);
        return geometricMean;
    }

    // Check is the array sorted;
    public static boolean isSequenceRise(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Check is the array sorted - is sequence rise");
        for (int i = 0; i < vector.length - 1; i++) {
            LOGGER.trace("Check is the array sorted - is sequence rise. Iteration step: " + i);
            if (!(vector[i] < vector[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSequenceDown(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Check is the array sorted - is sequence down");
        for (int i = 0; i < vector.length - 1; i++) {
            LOGGER.trace("Check is the array sorted - is sequence down. Iteration step: " + i);
            if (!(vector[i] > vector[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySorted(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Check is the array sorted");
        return isSequenceRise(vector) || isSequenceDown(vector);
    }

    // Find the index of local maximum;
    public static int findIndexOfLocalMax(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Find the index of local maximum");
        for (int i = 0; i < vector.length; ++i) {
            LOGGER.trace("Find the index of local maximum. Iteration step: " + i);
            if ((i == 0 && vector[i] > vector[i + 1])
                    || (i == vector.length - 1 && vector[i - 1] < vector[i])
                    || (i != 0 && i != vector.length - 1 && vector[i] > vector[i - 1] && vector[i] > vector[i + 1])) {
                return i;
            }
        }
        return NO_RESULT;
    }

    // Find the index of local minimum;
    public static int findIndexOfLocalMin(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Find the index of local minimum");
        for (int i = 0; i < vector.length; ++i) {
            LOGGER.trace("Find the index of local minimum. Iteration step: " + i);
            if ((i == 0 && vector[i] < vector[i + 1])
                    || (i == vector.length - 1 && vector[i - 1] > vector[i])
                    || (i != 0 && i != vector.length - 1 && vector[i] < vector[i - 1] && vector[i] < vector[i + 1])) {
                return i;
            }
        }
        return NO_RESULT;
    }

    // Reverse array;
    public static void reverseVector(double[] vector) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Reverse array");
        for (int i = 0; i < vector.length / HALF; i++) {
            LOGGER.trace("Reverse array. Iteration step: " + i);
            exchangeElements(vector, i, vector.length - 1 - i);
        }
    }

    // Search the value among values of vector;

    // Use  linear algorithm;
    public static int linearSearch(double[] vector, double number) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Search the value among values of vector by linear algorithm");
        for (int i = 0; i < vector.length; i++) {
            LOGGER.trace("Search the value among values of vector by linear algorithm. Iteration step: " + i);
            if (vector[i] == number) {
                return i;
            }
        }
        return NO_RESULT;
    }

    // Use  binary algorithm (can use only for sorted massive);
    public static int binarySearch(double[] vector, double number) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Search the value among values of vector by binary algorithm");
        sortBubble(vector, true);
        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        int middleIndex;
        int step = 0;

        while (firstIndex <= lastIndex) {
            LOGGER.trace("Search the value among values of vector by binary algorithm: " + step++);
            middleIndex = (firstIndex + lastIndex) / HALF;
            if (vector[middleIndex] == number) {
                return middleIndex;
            } else if (vector[middleIndex] < number) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return NO_RESULT;
    }

    // Sort array: sortIndicator demonstrate will be array sort increase or decrease;

    // Bubble sort;
    public static void sortBubble(double[] vector, boolean sortIndicator) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Bubble sort");
        for (int i = 1; i < vector.length; ++i) {
            for (int j = 0; j < vector.length - i; ++j) {
                LOGGER.trace("Bubble sort. Iteration step: " + i);
                if (sortIndicator) {
                    if (vector[j] > vector[j + 1]) {
                        exchangeElements(vector, j, j + 1);
                    }
                } else {
                    if (vector[j] < vector[j + 1]) {
                        exchangeElements(vector, j, j + 1);
                    }
                }
            }
        }
    }


    // Insertion sort;
    public static void sortInsertion(double[] vector, boolean sortIndicator) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Insertion sort");
        for (int left = 0; left < vector.length; left++) {
            LOGGER.trace("Insertion sort. Iteration step: " + left);
            double value = vector[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (sortIndicator) {
                    if (value < vector[i]) {
                        vector[i + 1] = vector[i];
                    } else {
                        break;
                    }
                } else {
                    if (value > vector[i]) {
                        vector[i + 1] = vector[i];
                    } else {
                        break;
                    }
                }
            }
            vector[i + 1] = value;
        }
    }

    // Selection sort;
    public static void sortSelection(double[] vector, boolean sortIndicator) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Selection sort");
        for (int i = 0; i < vector.length; i++) {
            int index = i;
            for (int j = i; j < vector.length; j++) {
                LOGGER.trace("Selection sort. Iteration step: " + i);
                if (sortIndicator) {
                    if (vector[j] < vector[index]) {
                        index = j;
                    }
                } else {
                    if (vector[j] > vector[index]) {
                        index = j;
                    }
                }
                exchangeElements(vector, i, index);
            }
        }
    }


    // Quick sort;
    private static void sortQuick(double[] vector, int left, int right, boolean order) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int average = i - (i - j) / HALF;
        while (i < j) {
            while (i < average && ((order && vector[i] <= vector[average]) || (!order && vector[i]
                    >= vector[average]))) {
                i++;
            }
            while (j > average && ((order && vector[j] >= vector[average]) || (!order && vector[j]
                    <= vector[average]))) {
                j--;
            }
            if (i < j) {
                exchangeElements(vector, i, j);
                if (i == average) {
                    average = j;
                } else if (j == average) {
                    average = i;
                }
                sortQuick(vector, left, average, order);
                sortQuick(vector, average + 1, right, order);
            }
        }
    }

    public static void sortQuick(double[] vector, boolean sortIndicator) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Quick sort: increase");
        if (sortIndicator) {
            sortQuick(vector, 0, vector.length - 1, true);
        } else {
            sortQuick(vector, 0, vector.length - 1, false);
        }
    }


    // Merge sort;
    private static void sortMerge(double[] vector, int left, int right, boolean order) {
        if (right <= left) {
            return;
        }
        int middle = left + (right - left) / HALF;
        sortMerge(vector, left, middle, order);
        sortMerge(vector, middle + 1, right, order);

        double[] key = new double[vector.length];

        for (int k = left; k <= right; ++k) {
            key[k] = vector[k];
        }
        for (int i = left, j = middle + 1, k = left; k <= right; k++) {
            if (i > middle) {
                vector[k] = key[j++];
            } else if (j > right) {
                vector[k] = key[i++];
            } else if ((order && key[j] < key[i]) || (!order && key[j] > key[i])) {
                vector[k] = key[j++];
            } else {
                vector[k] = key[i++];
            }
        }
    }

    public static void sortMerge(double[] vector, boolean sortIndicator) throws NullArrayException {
        checkNull(vector);
        LOGGER.debug("Merge sort");
        if (sortIndicator) {
            sortMerge(vector, 0, vector.length - 1, true);
        } else {
            sortMerge(vector, 0, vector.length - 1, false);
        }
    }
}
