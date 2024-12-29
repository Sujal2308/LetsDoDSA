package DSA.Arrays;

public class LeetCode217 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(isDuplicate(arr));
    }
    static boolean isDuplicate(int[] nums){
        boolean swap;
        for(int i = 0 ; i<nums.length ; i++){
            swap = false;
            for(int j = 1 ; j <nums.length - i ;j++){
                if(nums[j]==nums[j-1]){
                    return true;
                }
                if(nums[j]<nums[j-1]){
                    // Perform swapping
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
                // It means if swapping is not done for any "i"th pass which
                // means array is already sorted so no need to iterate again
            }
        }
        return false;
    }

}
