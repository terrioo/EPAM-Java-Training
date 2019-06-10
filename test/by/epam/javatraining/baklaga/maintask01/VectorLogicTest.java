package by.epam.javatraining.baklaga.maintask01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {
    double[] vector = {3.1, 6.7, 8.4, 8.2, 9.7, 11.4, 2.3, 5.3};
    double number = 6.7;
    double delta = 0.005;

    @Test
    public void checkNullFalse() {
        boolean expected = false;
        assertEquals(expected, VectorLogic.checkNull(vector));
    }

    @Test
    public void checkNullTrue() {
        double[] vector = new double[0];
        boolean expected = true;
        assertEquals(expected, VectorLogic.checkNull(vector));
    }


    @Test
    public void findMaxValue() {
        double expected = 11.4;
        assertEquals(expected, VectorLogic.findMaxValue(vector), delta);
    }

    @Test
    public void findMinValue() {
        double expected = 2.3;
        assertEquals(expected, VectorLogic.findMinValue(vector), delta);
    }

    @Test
    public void calculateArithmeticAverage() {
        double expected = 6.8874;
        assertEquals(expected, VectorLogic.calculateArithmeticAverage(vector), delta);
    }

    @Test
    public void calculateGeometricMean() {
        double expected = 6.1045;
        assertEquals(expected, VectorLogic.calculateGeometricMean(vector), delta);
    }

    @Test
    public void isSequenceRiseFalse() {
        boolean expected = false;
        assertEquals(expected, VectorLogic.isSequenceRise(vector));
    }

    @Test
    public void isSequenceRiseTrue() {
        double[] vector = {3, 6, 8, 9, 12, 15};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isSequenceRise(vector));
    }

    @Test
    public void isSequenceFalse() {
        boolean expected = false;
        assertEquals(expected, VectorLogic.isSequenceDown(vector));
    }

    @Test
    public void isSequenceTrue() {
        double[] vector = {12, 7, 6, 3, 2, 1};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isSequenceDown(vector));
    }

    @Test
    public void isArraySortedFalse() {
        boolean expected = false;
        assertEquals(expected, VectorLogic.isArraySorted(vector));
    }

    @Test
    public void isArraySortedTrue() {
        double[] vector = {12, 7, 6, 3, 2, 1};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isArraySorted(vector));
    }

    @Test
    public void findIndexOfLocalMax() {
        int expected = 2;
        assertEquals(expected, VectorLogic.findIndexOfLocalMax(vector));
    }

    @Test
    public void findIndexOfLocalMin() {
        int expected = 0;
        assertEquals(expected, VectorLogic.findIndexOfLocalMin(vector));
    }

    @Test
    public void reverseVector() {
        double[] vector = {3, 6, 8, 8, 9, 17, 2, 5};
        double[] expected = {5, 2, 17, 9, 8, 8, 6, 3};
        Assert.assertArrayEquals(expected, VectorLogic.reverseVector(vector), delta);

    }

    @Test
    public void linearSearchTrue() {
        int expected = 1;
        assertEquals(expected, VectorLogic.linearSearch(vector, number));
    }

    @Test
    public void linearSearchFalse() {
        double number = 22;
        int expected = -1;
        assertEquals(expected, VectorLogic.linearSearch(vector, number));
    }


    @Test
    public void binarySearchTrue() {
        VectorLogic.sortBubbleIncrease(vector);
        int expected = 3;
        assertEquals(expected, VectorLogic.binarySearch(vector, number));
    }

    @Test
    public void binarySearchFalse() {
        VectorLogic.sortBubbleIncrease(vector);
        double number = 22;
        int expected = -1;
        assertEquals(expected, VectorLogic.binarySearch(vector, number));
    }

    @Test
    public void sortBubbleIncrease() {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        Assert.assertArrayEquals(expected, VectorLogic.sortBubbleIncrease(vector), delta);
    }

    @Test
    public void sortBubbleDecrease() {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        Assert.assertArrayEquals(expected, VectorLogic.sortBubbleDecrease(vector), delta);
    }

    @Test
    public void sortInsertionIncrease() {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        Assert.assertArrayEquals(expected, VectorLogic.sortInsertionIncrease(vector), delta);
    }

    @Test
    public void sortInsertionDecrease() {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        Assert.assertArrayEquals(expected, VectorLogic.sortBubbleDecrease(vector), delta);
    }

    @Test
    public void sortSelectionIncrease() {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        Assert.assertArrayEquals(expected, VectorLogic.sortSelectionIncrease(vector), delta);
    }

    @Test
    public void sortSelectionDecrease() {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        Assert.assertArrayEquals(expected, VectorLogic.sortSelectionDecrease(vector), delta);
    }

    @Test
    public void sortQuickIncrease() {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        Assert.assertArrayEquals(expected, VectorLogic.sortQuickIncrease(vector), delta);
    }

    @Test
    public void sortQuickDecrease() {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        Assert.assertArrayEquals(expected, VectorLogic.sortQuickDecrease(vector), delta);
    }

    @Test
    public void sortMergeIncrease() {
        double[] expected = {2.3, 3.1, 5.3, 6.7, 8.2, 8.4, 9.7, 11.4};
        Assert.assertArrayEquals(expected, VectorLogic.sortMergeIncrease(vector), delta);
    }

    @Test
    public void sortMergeDecrease() {
        double[] expected = {11.4, 9.7, 8.4, 8.2, 6.7, 5.3, 3.1, 2.3};
        Assert.assertArrayEquals(expected, VectorLogic.sortMergeDecrease(vector), delta);
    }
}