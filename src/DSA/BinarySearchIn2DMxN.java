package DSA;

import java.util.Arrays;

public class BinarySearchIn2DMxN {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10,20,30},
                {11,22,33},
                {12,24,36},
                {13,26,39}
        };
        int target = 26;
        System.out.println(Arrays.toString(BSin2D(arr2D,target)));
    }
    static int[] BSin2D(int[][] arr,int target){
        int row = 0;
        int col = arr[row].length-1;
        while(row<= arr.length-1 && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]<target){
                row++;
            }else col--;
        }
        return new int[]{-1,-1};
    }
}
