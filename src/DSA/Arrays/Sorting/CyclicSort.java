package Arrays;


import java.util.*;
public class InterSection {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        CS(arr1);
    }

    static void CS(int[] arr){
        int j = 0;
        while(j<arr.length){
            int rightPosition = arr[j]-1;
            if(j != rightPosition ){
               swap(j,rightPosition,arr);
            }else j++;

        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int i , int k , int[] arr){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}

