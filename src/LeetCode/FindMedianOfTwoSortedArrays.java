package LeetCode;

import java.util.Arrays;

public class FindMedianOfTwoSortedArrays {
    /*


    Still not finish


     */
    public static double findMedianSortedArrays(int[] num1, int[] num2){
        int len1 = num1.length;
        int len2 = num2.length;
        int totalLen = len1 + len2;
        int mid = totalLen / 2;
        int i1 = 0;
        int i2 = 0;

        if(len1 == 0 && len2 == 0)
            return 0.0;
        if(len1 == 0)
            return getMedianOfAnArray(num2, mid, totalLen);
        if(len2 == 0)
            return  getMedianOfAnArray(num1, mid, totalLen);

        if(len1 == 1 && len2 == 1)
            return (double)(num1[0] + num2[0]) / 2;

        if(num1[len1 - 1] < num2[0])
            return subFind(num1, num2, mid, totalLen);
        if(num2[len2 - 1] < num1[0])
            return  subFind(num2, num1, mid, totalLen);

        while(i1 + i2 < mid && i1 < len1 && i2 < len2 ){
            if(num1[i1] <= num2[i2] && i1 < len1 - 1)
                i1++;
            if(num1[i1] > num2[i2] && i2 < len2 - 1)
                i2++;
        }
        if(totalLen % 2 == 1)
            return (double) (Math.min(num1[i1], num2[i2]));
        else{
            int[] arr = {num1[i1 - 1], num1[i1], num2[i2-1], num2[i2]};
            Arrays.sort(arr);
            return (double) (arr[1] + arr[2])/ 2;
        }
    }

    private static double subFind(int[] num1, int[] num2, int mid, int totalLen) {
        int len1 = num1.length;
        int len2 = num2.length;

        if(totalLen % 2 == 1){
            if (mid > len1) {
                return (double)num2[mid - len1 - 1];
            } else if (mid == len1) {
                return (double)num2[0];
            }
            return num1[mid - 1];
        }
        else{
            if(mid > len1){
                int index = mid - len1 - 1;
                return (double)(num2[index] + num2[index + 1]) / 2;
            }else if( mid < len1 - 1){
                return (double)(num1[mid -1] + num1[mid]) / 2;
            }
            return (double)(num1[len1 - 1] + num2[0]) / 2;
        }
    }

    public static double getMedianOfAnArray(int[] nums, int mid, int length){
        return length %2 == 0
                ? (double) (nums[mid - 1] + nums[mid]) / 2
                : (double) nums[mid];
    }
}
