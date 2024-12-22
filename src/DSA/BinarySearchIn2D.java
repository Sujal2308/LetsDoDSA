package DSA;

import java.util.Arrays;
// square matrix;
public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr2D = {
                {-1,3}
        };
        int target = 3;
        System.out.println(Arrays.toString(BSin2D(arr2D,target)));
    }
    static int[] BSin2D(int[][] arr , int target){
        // Assuming array is square matrix
        int row = 0;
        int col ;
        if(arr.length == 1){
            col = 1;
        }else col = arr.length-1;
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
