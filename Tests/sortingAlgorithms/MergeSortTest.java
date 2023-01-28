package sortingAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    public void CanSort(){
        // Arrange
        int[] arr = {9,5,5,5,5,5,5,3,3,6,2,1,7,8};
        int[] expectedResult = {1,2,3,3,5,5,5,5,5,5,6,7,8,9};

        // Act
        MergeSort.sort(arr, 0, arr.length);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }
}