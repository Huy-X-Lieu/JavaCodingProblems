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

    public static void myMergeSort(int[] arr, int begin, int end){
        if(end - begin < 2)
            return;

        int mid = (begin + end) /2;
        myMergeSort(arr, begin, mid);
        myMergeSort(arr, mid, end);
        myMerge(arr, begin, mid, end);
    }

    public static void myMerge(int[] arr, int begin, int mid, int end){
        if(arr[mid - 1] <= arr[mid])
            return;

        int i = begin;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - begin];

        while(i < mid && j < end){
            temp[tempIndex++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i< mid){
            temp[tempIndex++] = arr[i++];
        }
        while (j < end){
            temp[tempIndex++] = arr[j++];
        }

        System.arraycopy(temp,0, arr,begin,tempIndex);
    }
}
