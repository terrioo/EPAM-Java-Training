package by.epam.javatraining.baklaga.maintask01;

/**
 * The program is used for vector operations.
 * It solves the following tasks:
 * 1. Find extreme values
 * 2. Find arithmetic average and geometric mean values of vector
 * 3. Check if array is sorted
 * 4. Find first local extreme ofvector
 * 5. Search the element of vector
 * 6. Reverse vector
 * 7. Sort values of vector by different sort algorithms
 *
 * @author Baklaga Tatsiana
 * @version 1.0
 * @date 10/06/2019
 */


public class MainTask {
   public static void main(String[] args) throws NullArrayException {
        double[] vector = new double[10];
        vector = Initializer.fillArray(vector);     // fill array with randomized values;
        double number = 6.0;
        boolean sortIndicator = false;  // true - increase sort; false - decrease sort;
        Printer.printArray(vector);

        double maxValue = VectorLogic.findMaxValue(vector);
        Printer.print("Max value is " + maxValue);

        double minValue = VectorLogic.findMinValue(vector);
        Printer.print("Min value is " + minValue);

        double arithmeticAverage = VectorLogic.calculateArithmeticAverage(vector);
        Printer.print("ArithmeticAverage is " + arithmeticAverage);

        double geometricMean = VectorLogic.calculateGeometricMean(vector);
        Printer.printGeometricMean(geometricMean);

        Printer.isArraySorted(VectorLogic.isArraySorted(vector));

        double localMaximum = VectorLogic.findIndexOfLocalMax(vector);
        Printer.print("Index of local maximum is " + localMaximum);

        double localMinimum = VectorLogic.findIndexOfLocalMin(vector);
        Printer.print("Index of local minimum is " + localMinimum);

        VectorLogic.reverseVector(vector);
        double[] reverse = vector;
        Printer.printArray(reverse);

        int resultOfLinearSearchNumber = VectorLogic.linearSearch(vector, number);
        Printer.printResultOfSearch(resultOfLinearSearchNumber);

        VectorLogic.sortBubble(vector, true);
        Printer.printArray(vector);

        // Binary algorithm can use only for sorted massive;
        int resultOfBinarySearchNumber = VectorLogic.binarySearch(vector, number);
        Printer.printResultOfSearch(resultOfBinarySearchNumber);

        VectorLogic.sortBubble(vector, sortIndicator);
        Printer.printArray(vector);

        VectorLogic.sortInsertion(vector, sortIndicator);
        Printer.printArray(vector);

        VectorLogic.sortSelection(vector, sortIndicator);
        Printer.printArray(vector);

        VectorLogic.sortQuick(vector, sortIndicator);
        Printer.printArray(vector);

        VectorLogic.sortMerge(vector, sortIndicator);
        Printer.printArray(vector);
    }
}
