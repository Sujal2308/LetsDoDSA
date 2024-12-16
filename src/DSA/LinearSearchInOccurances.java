package DSA;

import java.util.ArrayList;

public class LinearSearchInOccurances {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        int target = 1;
        System.out.println(LS(arr, target));
    }

    static ArrayList<Integer> LS(int[] arr1, int target) {
        // Since size of the array is not determined initially so
        // better to create dynamic arrays
        // because there can be any no. of occurances.
        ArrayList<Integer> demoArr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                demoArr.add(i);

            }

        }

        if(demoArr.isEmpty()){
            demoArr.add(-1);
            return demoArr;
        }
        return demoArr;

    }
}
