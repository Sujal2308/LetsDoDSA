package DSA;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(concatArr(arr)));
    }
    static int[] concatArr(int[] nums){
        int len = nums.length * 2;
        int[] newArr = new int[len];
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            newArr[index] = nums[i];
            index++;
        }
        for(int i = 0 ; i < nums.length ; i++){
            newArr[index] = nums[i];
            index++;
        }
        // for(int i = 0 ; i < nums.length ; i++){
        //            newArr[index] = nums[i];
        //            newArr[nums.length + 1] = nums[i];
        //        }

        return newArr;
    }
}
