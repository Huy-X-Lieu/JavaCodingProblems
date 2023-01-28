package sortingAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    public void canSortArrayOfIntegers(){
        // Arrange
        int[] arr = {4,3,1,2};
        int[] expectedResult = {1,2,3,4};

        // Act
        SelectionSort.sort(arr);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }
}