package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        // PSUEDO CODE:
        //for(stopIndex = array's length; stopIndex >= 1; stopindex--)
        //--maxValueIndex = 0
        //--for(i = 1; i <= stopIndex; i++)
        //----if(array[i] > array(maxValueIndex))
        //------update maxValueIndex
        //--swap(array[maxValueindex], array[stopIndex])


        for (int endIndex = arr.length - 1; endIndex >= 1; endIndex--) {
            int maxValueIndex = 0;
            for (int i = 1; i <= endIndex; i++) {
                if(arr[maxValueIndex] < arr[i])
                    maxValueIndex = i;
            }
            swap(arr, maxValueIndex, endIndex);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
