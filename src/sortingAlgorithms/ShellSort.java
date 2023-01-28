package sortingAlgorithms;

import java.util.Arrays;

public class ShellSort {
    public static void sortWithInsertionSortStyle(int[] arr){
        if(arr == null || arr.length == 0 || arr.length == 1)
            return;
        for(int gap = arr.length / 2; gap > 0; gap/=2){
            for(int i = gap; i < arr.length; i++) {
                int currentValue = arr[i];
                int leftMostIndex = i;

                for (int j = i; j - gap >= 0; j -= gap) {
                    if (arr[j - gap] > currentValue) {
                        leftMostIndex = (j - gap);
                        arr[j] = arr[j - gap];
                    }
                }

                arr[leftMostIndex]= currentValue;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void sortWithBubbleSortStyle(int[] arr){
        if(arr == null || arr.length <= 1)
            return;

        for(int gap = arr.length / 2; gap > 0; gap/=2){
            for (int i = 0; i < arr.length - gap; i++){
                for(int j = i; j < arr.length - gap; j +=gap){
                    if(arr[j] > arr[j + gap]){
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }
}
