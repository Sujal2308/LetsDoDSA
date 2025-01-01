package DSA;

public class LeetCode35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsertPosition(arr,target));
    }
    static int searchInsertPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        // here start and end are indexes
        int middle = 0;
        while(start<=end){
            middle = (start+end)/2 ; // optimized way of (s+e)/2
            // middle is also an index
            if(target>nums[middle]){
                // It means target lies in right side of middle
                start = middle + 1;
            } else if (target < nums[middle]) {
                // It means target lies in left side of middle
                end = middle - 1;
            }else return middle;

        }
        return start;
    }
}
