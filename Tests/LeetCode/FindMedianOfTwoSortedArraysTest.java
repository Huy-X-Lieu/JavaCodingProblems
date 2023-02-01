package LeetCode;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianOfTwoSortedArraysTest {
    @Test
    public void canGetMedian() {
        // Arrange
        int[] num1 = {0,0};
        int[] num2 = {0,0};
        double expected = 0.0;
        DecimalFormat df = new DecimalFormat("#.##");

        // Act
        double result = FindMedianOfTwoSortedArrays.findMedianSortedArrays(num1, num2);

        // Assert
        assertEquals(df.format(expected), df.format(result));
    }
}