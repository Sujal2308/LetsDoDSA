package Arrays;

import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
      int[] arr = {0,1,0,3,4};
      moveZeroes(arr);
    }
    static void moveZeroes(int[] nums) {
           for(int i = 0 ; i < nums.length ; i++){
               for(int j = i+1 ; j < nums.length ; j++){
                   if(nums[i]==0 && nums[j]!=0){
                       int temp = nums[i];
                       nums[i] = nums[j];
                       nums[j] = temp;
                       break;
                   }
               }
           }
        System.out.println(Arrays.toString(nums));
    }
}
