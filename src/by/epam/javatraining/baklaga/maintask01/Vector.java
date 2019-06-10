package by.epam.javatraining.baklaga.maintask01;

public class Vector {
    public static void main(String[] args) throws NullArrayException {
        double[] vector = new double[10];
        vector = VectorLogic.fillArray(vector);     // fill array with randomized values;
        double number = 6.0;
        boolean nullVector = VectorLogic.checkNull(vector);
        if (nullVector != true) {
            Printer.printArray(vector);

            double maxValue = VectorLogic.findMaxValue(vector);
            Printer.print("Max value is " + maxValue);

            double minValue = VectorLogic.findMinValue(vector);
            Printer.print("Min value is " + minValue);

            double arithmeticAverage = VectorLogic.calculateArithmeticAverage(vector);
            Printer.print("ArithmeticAverage is " + arithmeticAverage);

            double geometricMean = VectorLogic.calculateGeometricMean(vector);
            Printer.print("GeometricMean is " + geometricMean);

            Printer.isArraySorted(VectorLogic.isArraySorted(vector));

            double localMaximum = VectorLogic.findIndexOfLocalMax(vector);
            Printer.print("Index of local maximum is " + localMaximum);

            double localMinimum = VectorLogic.findIndexOfLocalMin(vector);
            Printer.print("Index of local minimum is " + localMinimum);

            double[] reverse = VectorLogic.reverseVector(vector);
            Printer.printArray(reverse);

            int resultOfLinearSearchNumber = VectorLogic.linearSearch(vector, number);
            Printer.printResultOfSearch(resultOfLinearSearchNumber);

            double[] bubbleSortIncrease = VectorLogic.sortBubbleIncrease(vector);
            Printer.printArray(bubbleSortIncrease);

            double[] bubbleSortDecrease = VectorLogic.sortBubbleDecrease(vector);
            Printer.printArray(bubbleSortDecrease);

            // Binary algorithm can use only for sorted massive;
            int resultOfBinarySearchNumber = VectorLogic.binarySearch(bubbleSortDecrease, number);
            Printer.printResultOfSearch(resultOfBinarySearchNumber);

            double[] insertionSortIncrease = VectorLogic.sortInsertionIncrease(vector);
            Printer.printArray(insertionSortIncrease);

            double[] insertionSortDecrease = VectorLogic.sortInsertionDecrease(vector);
            Printer.printArray(insertionSortDecrease);

            double[] selectionSortIncrease = VectorLogic.sortSelectionIncrease(vector);
            Printer.printArray(selectionSortIncrease);

            double[] selectionSortDecrease = VectorLogic.sortSelectionDecrease(vector);
            Printer.printArray(selectionSortDecrease);

            double[] quickSortIncrease = VectorLogic.sortQuickIncrease(vector);
            Printer.printArray(quickSortIncrease);

            double[] quickSortDecrease = VectorLogic.sortQuickDecrease(vector);
            Printer.printArray(quickSortDecrease);

            double[] mergeSortIncrease = VectorLogic.sortMergeIncrease(vector);
            Printer.printArray(mergeSortIncrease);

            double[] mergeSortDecrease = VectorLogic.sortMergeDecrease(vector);
            Printer.printArray(mergeSortDecrease);
        } else throw new NullArrayException("Vector can't be null. It's length must be greater than 0.");
    }
}
