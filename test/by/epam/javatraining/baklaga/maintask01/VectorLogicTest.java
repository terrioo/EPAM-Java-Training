package by.epam.javatraining.baklaga.maintask01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {
    double[] vector = {3.1, 6.7, 8.4, 8.2, 9.7, 11.4, 2.3, 5.3};
    double number = 6.7;
    double delta = 0.005;

    @Test(expected = NullArrayException.class)
    public void checkNullException() throws NullArrayException {
        double[] vector = new double[]{};
        VectorLogic.checkNull(vector);
    }

    @Test(expected = NullArrayException.class)
    public void checkNullException2() throws NullArrayException {
        double[] vector = null;
        VectorLogic.checkNull(vector);
    }

    @Test
    public void findMaxValue() throws NullArrayException {
        double expected = 11.4;
        assertEquals(expected, VectorLogic.findMaxValue(vector), delta);
    }

    @Test
    public void findMinValue() throws NullArrayException {
        double expected = 2.3;
        assertEquals(expected, VectorLogic.findMinValue(vector), delta);
    }

    @Test
    public void calculateArithmeticAverage() throws NullArrayException {
        double expected = 6.8874;
        assertEquals(expected, VectorLogic.calculateArithmeticAverage(vector), delta);
    }

    @Test
    public void calculateGeometricMeanCorrectParameters() throws NullArrayException {
        double expected = 6.1045;
        assertEquals(expected, VectorLogic.calculateGeometricMean(vector), delta);
    }

    @Test
    public void calculateGeometricMeanWrongParameters() throws NullArrayException {
        double[] vector = {3.1, 6.7, 8.4, -8.2, 9.7, 11.4, 2.3, -5.3};
        double expected = -1;
        assertEquals(expected, VectorLogic.calculateGeometricMean(vector), delta);
    }

    @Test
    public void isSequenceRiseFalse() throws NullArrayException {
        boolean expected = false;
        assertEquals(expected, VectorLogic.isSequenceRise(vector));
    }

    @Test
    public void isSequenceRiseTrue() throws NullArrayException {
        double[] vector = {3, 6, 8, 9, 12, 15};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isSequenceRise(vector));
    }

    @Test
    public void isSequenceDownFalse() throws NullArrayException {
        boolean expected = false;
        assertEquals(expected, VectorLogic.isSequenceDown(vector));
    }

    @Test
    public void isSequenceDownTrue() throws NullArrayException {
        double[] vector = {12, 7, 6, 3, 2, 1};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isSequenceDown(vector));
    }

    @Test
    public void isArraySortedFalse() throws NullArrayException {
        boolean expected = false;
        assertEquals(expected, VectorLogic.isArraySorted(vector));
    }

    @Test
    public void isArraySortedTrue() throws NullArrayException {
        double[] vector = {12, 7, 6, 3, 2, 1};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isArraySorted(vector));
    }

    @Test
    public void findIndexOfLocalMax() throws NullArrayException {
        int expected = 2;
        assertEquals(expected, VectorLogic.findIndexOfLocalMax(vector));
    }

    @Test
    public void findIndexOfLocalMin() throws NullArrayException {
        int expected = 0;
        assertEquals(expected, VectorLogic.findIndexOfLocalMin(vector));
    }

    @Test
    public void reverseVector() throws NullArrayException {
        double[] vector = {3, 6, 8, 8, 9, 17, 2, 5};
        double[] expected = {5, 2, 17, 9, 8, 8, 6, 3};
        VectorLogic.reverseVector(vector);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void linearSearchTrue() throws NullArrayException {
        int expected = 1;
        assertEquals(expected, VectorLogic.linearSearch(vector, number));
    }

    @Test
    public void linearSearchFalse() throws NullArrayException {
        double number = 22;
        int expected = -1;
        assertEquals(expected, VectorLogic.linearSearch(vector, number));
    }

    @Test
    public void binarySearchTrue() throws NullArrayException {
        VectorLogic.sortBubble(vector, true);
        int expected = 3;
        assertEquals(expected, VectorLogic.binarySearch(vector, number));
    }

    @Test
    public void binarySearchFalse() throws NullArrayException {
        VectorLogic.sortBubble(vector, true);
        double number = 22;
        int expected = -1;
        assertEquals(expected, VectorLogic.binarySearch(vector, number));
    }

    @Test
    public void sortBubbleIncrease() throws NullArrayException {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        VectorLogic.sortBubble(vector, true);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortBubbleDecrease() throws NullArrayException {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        VectorLogic.sortBubble(vector, false);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortInsertionIncrease() throws NullArrayException {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        VectorLogic.sortInsertion(vector, true);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortInsertionDecrease() throws NullArrayException {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        VectorLogic.sortBubble(vector, false);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortSelectionIncrease() throws NullArrayException {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        VectorLogic.sortSelection(vector, true);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortSelectionDecrease() throws NullArrayException {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        VectorLogic.sortSelection(vector, false);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortQuickIncrease() throws NullArrayException {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        VectorLogic.sortQuick(vector, true);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortQuickDecrease() throws NullArrayException {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        VectorLogic.sortQuick(vector, false);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortMergeIncrease() throws NullArrayException {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        VectorLogic.sortMerge(vector, true);
        assertArrayEquals(expected, vector, delta);
    }

    @Test
    public void sortMergeDecrease() throws NullArrayException {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        VectorLogic.sortMerge(vector, false);
        assertArrayEquals(expected, vector, delta);
    }
}
