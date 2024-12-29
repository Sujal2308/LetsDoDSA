package DSA.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,-1};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSorting(int[] arr){
        for(int i = 0 ; i< arr.length ; i++){
            //find the maximum item from the array
            int end = arr.length-i-1;
            int maxIndex = getMaxItem(arr , 0 , end);
            swap(arr , maxIndex , end);
        }
    }
   private static int getMaxItem(int[] arr , int start , int end){
        int max = start;
        for(int i = 0 ; i<=end ; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;

    }
    static void swap(int[] arr , int first , int second){
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;

    }


}
