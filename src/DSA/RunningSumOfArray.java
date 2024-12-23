package DSA;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println(Arrays.toString(RSA(arr)));
    }
    static int[] RSA(int[] nums){
        int[] newArr = new int[nums.length];
        for(int i  = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = 0 ; j <= i ; j++){
                sum = sum + nums[j];
                newArr[i] = sum;
            }
        }
        return newArr;

    }
}
