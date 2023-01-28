package sortingAlgorithsms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void canSortArrayOfIntegers(){
        // Arrange
        int[] arr = {9,5,5,3,3,6,2,1,7,8};
        int[] expectedResult = {1,2,3,3,5,5,6,7,8,9};

        // Act
        BubbleSort.sort(arr);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }
}