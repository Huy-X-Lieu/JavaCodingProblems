package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr, int start, int end) {
        if ((end - start) < 2)
            return;

        int middle = (start + end) / 2;
        sort(arr, start, middle);
        sort(arr, middle, end);
        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        if(arr[middle - 1] <= arr[middle])
            return;

        int i = start;
        int j = middle;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while(i < middle && j < end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + tempIndex, middle - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);

    }

}
