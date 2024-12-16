package DSA;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10,20,3,4},
                {1,2},
                {-1}
        };
        int target = 1;
        System.out.println(Arrays.toString(linearSearch2D(arr2D,target)));


    }
    static int[] linearSearch2D(int[][] arr2d , int target){
        for(int i = 0 ; i< arr2d.length ; i++){
            for(int j = 0; j< arr2d[i].length ; j++){
                if(arr2d[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
