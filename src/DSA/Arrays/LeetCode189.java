package DSA.Arrays;

import java.util.Arrays;

public class LeetCode189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 5;
        rotateArray(arr,k);
    }
    static void rotateArray(int[] nums, int k){

        while(k>0){
            int i = nums.length -1;
            int j = nums.length -2;
            while(i>0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i--;
                    j--;
                }
            k--;
            }
        System.out.println(Arrays.toString(nums));
        }



    }

