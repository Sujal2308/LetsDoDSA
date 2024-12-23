package DSA;

import java.util.ArrayList;

//leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {4,1,4,8,9,6,4};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies , int extraCandies){
        ArrayList<Boolean> myArr = new ArrayList<>();
        int maxCandies = sum(candies);
        int sum = 0;
        for(int i = 0 ; i < candies.length ; i++){
            sum = extraCandies + candies[i];
            if(sum>=maxCandies){
                myArr.add(true);
            }else {
                myArr.add(false);
            }
        }
        return myArr;
    }
    static int sum(int[] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
