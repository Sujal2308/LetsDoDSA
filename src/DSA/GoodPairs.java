package DSA;

import java.util.ArrayList;

//leetcode.com/problems/number-of-good-pairs/
public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {4,4,2,2};
        System.out.println(goodPairs(arr));
    }
    static int goodPairs(int[] nums){
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]==nums[j] && i < j){
                    count ++;
                }
            }
        }

            return count ;


    }
}
