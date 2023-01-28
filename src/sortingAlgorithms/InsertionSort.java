package sortingAlgorithms;

public class InsertionSort {
    public static void sort(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return;

        for(int i = 1; i < arr.length; i++){
            int currentValue = arr[i];
            int leftMostIndex = 0;
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    arr[j] = arr[j - 1];
                    leftMostIndex = j -1;
                }
            }
            arr[leftMostIndex] = currentValue;
        }
    }

}
