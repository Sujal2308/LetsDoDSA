package DSA.Arrays.Sorting;

import java.util.Arrays;

public class LeetCode977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortSquares(arr)));

    }
    static int[] sortSquares(int[] nums){
        int[] newArr = new int[nums.length];
        for(int i = 0 ; i< nums.length;i++){
            newArr[i] = nums[i] * nums[i];
        }
       return BSort(newArr);
    }
    static int[] BSort(int[] arr){
        boolean swap;
        for(int i = 0 ; i<arr.length ; i++){
            swap = false;
            for(int j = 1 ; j <arr.length - i ;j++){
                if(arr[j]<arr[j-1]){
                    // Perform swapping
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
                // It means if swapping is not done for any "i"th pass which
                // means array is already sorted so no need to iterate again
            }
        }
        return arr; // inplace sorting since no new array being created
    }
}
