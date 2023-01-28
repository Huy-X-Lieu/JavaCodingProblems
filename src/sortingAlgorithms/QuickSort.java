package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int start, int end){
        if ((end - start) < 2)
            return;

        int pivotIndex = partition(arr, start, end);
        sort(arr, start, pivotIndex - 1);
        sort(arr, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i < j){
            while(i < j && arr[--j] >= pivot);
            if(i < j){
                arr[i++] = arr[j];
            }
            while(i < j && arr[++i] <= pivot);
            if(i < j){
                arr[j--] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }

    public static void myQuickSort(int[] arr, int begin, int end){
        if(end - begin < 2){
            return;
        }

        int pivotIndex = myPartition(arr, begin, end);
        myQuickSort(arr, begin, pivotIndex - 1);
        myQuickSort(arr, pivotIndex + 1, end);
    }

    public static int myPartition(int[] arr, int begin, int end){
        int i = begin;
        int j = end;
        int pivot = arr[begin];

        while(i < j){
            while (arr[i++] <= pivot);
            if (i < j){
                arr[j--] = arr[i];
            }
            while (arr[j++] >= pivot);
            if(i < j){
                arr[i++] = arr[j];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
