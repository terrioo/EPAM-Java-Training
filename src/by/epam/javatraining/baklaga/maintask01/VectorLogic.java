package by.epam.javatraining.baklaga.maintask01;

import java.util.Random;

public class VectorLogic {
    public static final Random random = new Random();
    public static final int RANDOM_INDICATOR = 16;
    public static final int NO_RESULT = -1;
    public static final int HALF = 2;

    // Fill the array with random values;
    public static double[] fillArray(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(RANDOM_INDICATOR);
        }
        return vector;
    }
    // Check is vector null array or not;
    public static boolean checkNull(double[] vector) {
        return vector.length == 0 || vector.length == 1;
    }

    // Swapping elements of array;
    private static void exchangeElements(double[] vector, int index1, int index2) {
        double newValue = vector[index1];
        vector[index1] = vector[index2];
        vector[index2] = newValue;
    }

    // Find the maximum value of vector;
    public static double findMaxValue(double[] vector) {
        double max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            max = max < vector[i] ? vector[i] : max;
        }
        return max;
    }

    // Find the minimum value of vector;
    public static double findMinValue(double[] vector) {
        double min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            min = min > vector[i] ? vector[i] : min;
        }
        return min;
    }

    // Find arithmetic average;
    public static double calculateArithmeticAverage(double[] vector) {
        double sumOfValues = 0;
        for (int i = 0; i < vector.length; i++) {
            sumOfValues += vector[i];
        }
        return sumOfValues /= vector.length;
    }

    // Find geometric mean;
    public static double calculateGeometricMean(double[] vector) {
        double multiplication = 1.0;
        for (int i = 0; i < vector.length; i++) {
            multiplication *= vector[i];
        }
        return Math.pow(multiplication, 1.0 / vector.length);
    }

    // Check is the array sorted;
    public static boolean isSequenceRise(double[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (!(vector[i] < vector[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSequenceDown(double[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            if (!(vector[i] > vector[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySorted(double[] vector) {
        return isSequenceRise(vector) || isSequenceDown(vector);
    }

    // Find the index of local maximum;
    public static int findIndexOfLocalMax(double[] vector) {
        for (int i = 0; i < vector.length; ++i) {
            if ((i == 0 && vector[i] > vector[i + 1])
                    || (i == vector.length - 1 && vector[i - 1] < vector[i])
                    || (i != 0 && i != vector.length - 1 && vector[i] > vector[i - 1] && vector[i] > vector[i + 1])) {
                return i;
            }
        }
        return NO_RESULT;
    }

    // Find the index of local minimum;
    public static int findIndexOfLocalMin(double[] vector) {
        for (int i = 0; i < vector.length; ++i) {
            if ((i == 0 && vector[i] < vector[i + 1])
                    || (i == vector.length - 1 && vector[i - 1] > vector[i])
                    || (i != 0 && i != vector.length - 1 && vector[i] < vector[i - 1] && vector[i] < vector[i + 1])) {
                return i;
            }
        }
        return NO_RESULT;
    }

    // Reverse array;
    public static double[] reverseVector(double[] vector) {
        // double newValue;                                     !!!!
        for (int i = 0; i < vector.length / HALF; i++) {
            exchangeElements(vector, i, vector.length - 1 - i);
        }
        return vector;
    }

    // Search the value among values of vector;

    // Use  linear algorithm;
    public static int linearSearch(double[] vector, double number) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == number) {
                return i;
            }
        }
        return NO_RESULT;
    }

    // Use  binary algorithm (can use only for sorted massive);
    public static int binarySearch(double[] vector, double number) {
        sortBubbleIncrease(vector);
        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        int middleIndex;

        while (firstIndex <= lastIndex) {
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

    // Bubble sort;
    public static double[] sortBubbleIncrease(double[] vector) {
        for (int i = 1; i < vector.length; ++i) {
            for (int j = 0; j < vector.length - i; ++j) {
                if (vector[j] > vector[j + 1]) {
                    exchangeElements(vector, j, j + 1);
                }
            }
        }
        return vector;
    }

    public static double[] sortBubbleDecrease(double[] vector) {
        for (int i = 1; i < vector.length; ++i) {
            for (int j = 0; j < vector.length - i; ++j) {
                if (vector[j] < vector[j + 1]) {
                    exchangeElements(vector, j, j + 1);
                }
            }
        }
        return vector;
    }

    // Insertion sort;
    public static double[] sortInsertionIncrease(double[] vector) {
        for (int left = 0; left < vector.length; left++) {
            double value = vector[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < vector[i]) {
                    vector[i + 1] = vector[i];
                } else {
                    break;
                }
            }
            vector[i + 1] = value;
        }
        return vector;
    }

    public static double[] sortInsertionDecrease(double[] vector) {
        for (int left = 0; left < vector.length; left++) {
            double value = vector[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > vector[i]) {
                    vector[i + 1] = vector[i];
                } else {
                    break;
                }
            }
            vector[i + 1] = value;
        }
        return vector;
    }


    // Selection sort;

    public static double[] sortSelectionIncrease(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int minIndex = i;
            for (int j = i; j < vector.length; j++) {
                if (vector[j] < vector[minIndex]) {
                    minIndex = j;
                }
            }
            exchangeElements(vector, i, minIndex);
        }

        return vector;
    }

    public static double[] sortSelectionDecrease(double[] vector) {

        for (int i = 0; i < vector.length; i++) {

            int maxIndex = i;

            for (int j = i; j < vector.length; j++) {
                if (vector[j] > vector[maxIndex]) {
                    maxIndex = j;
                }
            }
            exchangeElements(vector, i, maxIndex);
        }

        return vector;
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

    public static double[] sortQuickIncrease(double[] vector) {
        sortQuick(vector, 0, vector.length - 1, true);
        return vector;
    }

    public static double[] sortQuickDecrease(double[] vector) {
        sortQuick(vector, 0, vector.length - 1, false);
        return vector;
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

    public static double[] sortMergeIncrease(double[] vector) {
        sortMerge(vector, 0, vector.length - 1, true);
        return vector;
    }

    public static double[] sortMergeDecrease(double[] vector) {
        sortMerge(vector, 0, vector.length - 1, false);
        return vector;
    }
}
