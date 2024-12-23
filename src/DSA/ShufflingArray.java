package DSA;

import java.util.Arrays;

public class ShufflingArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(SA(arr,n)));
    }
    static int[] SA(int[] nums , int n){
        int[] shuffledArr = new int[nums.length];
        for(int i = 0 ; i< nums.length ;i++){
           if(i%2==0){
            shuffledArr[i] = nums[i/2];
}    else {
              shuffledArr[i] = nums[n];
              n++;
           }
        }
        return shuffledArr;
    }
}
