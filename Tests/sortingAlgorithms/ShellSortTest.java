package sortingAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {
    @Test
    public void ShellSortUsingInsertionSortStyle(){
        // Arrange
        int[] arr = {4,2,1,3,6,9,7,8,0,5};
        int[] expectedResult = {0,1,2,3,4,5,6,7,8,9};

        // Act
        ShellSort.sortWithInsertionSortStyle(arr);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }

    @Test
    public void ShellSortUsingBubbleSortStyle(){
        // Arrange
        int[] arr = {9,5,5,5,5,5,5,3,3,6,2,1,7,8};
        int[] expectedResult = {1,2,3,3,5,5,5,5,5,5,6,7,8,9};

        // Act
        ShellSort.sortWithBubbleSortStyle(arr);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }
}