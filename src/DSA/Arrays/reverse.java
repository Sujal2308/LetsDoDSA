import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        reverse(num);
    }
    static void reverse(int[] nums){
        for(int i = 0 ; i<nums.length/2 ; i++){
            int temp = nums[i];
             nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
           
        }
        System.out.println(Arrays.toString(nums));
    }
}
