package sortingAlgorithms;

public class BubbleSort {
    public static void sort(int[] arr) {
        // TODO implement bubble sort algorithm

        //PSUEDO CODE:
        // for(stopIndex = array's length; stopindex >= 1; stopIndex--)
        //-- for(i = 0; i < stopIndex; i++)
        //---- if(array[i] < array[i + 1])
        //------ swap(array[i] and array[i + 1])

        for (int stopIndex = arr.length - 1; stopIndex >= 1; stopIndex--) {
            for (int i = 0; i < stopIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}