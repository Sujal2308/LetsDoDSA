package DSA;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,0,0,1},
                {1,0,1,0}
        };

        // Arrays.deepString() is used to print 2D array
        System.out.println(Arrays.deepToString(flipImg(arr)));
    }
    static int[][] flipImg(int[][] image){
        int[][] newArr = new int[image.length][image.length];

        for(int i = 0 ; i<image.length ; i++){
            for(int j = image[i].length-1 ; j>=0 ; j--){
                int k = image.length-1 - j;
                if(k==0){
                    image[i][j] = 1;
                    newArr[i][k] = image[i][j];
                }else {
                    image[i][j]=0;
                    newArr[i][k] = image[i][j];
                }

            }
        }
        return newArr;
    }
}
