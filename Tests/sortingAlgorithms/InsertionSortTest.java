package sortingAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    public void ReturnEmptyArrayIfReceiveEmptyArray(){
        int[] emptyArray = {};
        int[] expectedResult = {};

        InsertionSort.sort(emptyArray);

        assertEquals(Arrays.toString(expectedResult),
                Arrays.toString(emptyArray));
    }

    @Test
    public void CanReturnArrayWithOneElementWhenReceiveArrayWithOneElement(){
        int[] target = {1};
        int[] expectedResult = {1};

        InsertionSort.sort(target);

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(target));
    }

    @Test
    public void CanSortArrayWithTwoElement(){
        int[] target = {2,1};
        int[] expectedResult = {1,2};

        InsertionSort.sort(target);

        assertEquals(Arrays.toString(expectedResult), Arrays.toString(target));
    }

    @Test
    public void CanSortArrayWithMultipleEmlemts(){
        // Arrange
        int[] arr = {9,5,5,3,3,6,2,1,7,8};
        int[] expectedResult = {1,2,3,3,5,5,6,7,8,9};

        // Act
        BubbleSort.sort(arr);
        // Assert
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(arr));
    }
}