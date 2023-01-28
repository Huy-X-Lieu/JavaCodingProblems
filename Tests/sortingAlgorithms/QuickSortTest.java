package sortingAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    public void CanSort(){
        // Arrange
        int[] arr = {5,2,1,4,3};
        int[] expectedResult = {1,2,3,4,5};

        // Act
        QuickSort.myQuickSort(arr, 0, arr.length);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }
}