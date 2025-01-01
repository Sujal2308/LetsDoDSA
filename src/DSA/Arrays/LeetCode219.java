package DSA.Arrays;

public class LeetCode219 {
    public static void main(String[] args) {

    }
    static boolean containsNearByDuplicate(int[] nums , int k){
        int compare = 0;
        for(int i = 0 ; i<nums.length-1 ; i++){
            for(int j = 1 ; j<nums.length -1 ; j++){
                if(nums[i]==nums[j]){
                    if((i-j)<0){
                        compare = i -j * -1;
                    }else compare = i - j;
                }
                if(compare<=k){
                    return true;
                }
            }

        }
        return false;
    }
}
