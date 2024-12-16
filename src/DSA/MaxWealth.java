package DSA;

import java.util.ArrayList;

//leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] arr){
        int min = Integer.MIN_VALUE;

        for(int i= 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < arr[i].length; j++){
                sum = sum + arr[i][j];


            }
            if(sum > min){
                min = sum;
            }


        }
        return min ;
    }
}
