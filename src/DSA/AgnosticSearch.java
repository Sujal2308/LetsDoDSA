package DSA;

public class AgnosticSearch {
    // When the order of array is not defined (whether ascending or descending
    public static void main(String[] args) {
        int[] arr = {100,23,11,2,-10};
        int target = 2;
        System.out.println(BS3(arr, target));
    }

    static int BS3(int[] sortArr , int target){
        int start = 0;
        int end = sortArr.length-1;
        boolean isAscending = sortArr[start] < sortArr[end];
        while(start<=end){
            int middle = start + (end-start)/2;
            if(isAscending){
                // sorted in ascending fashion
                if(target>sortArr[middle]){
                    // It means target lies in right side of middle
                    start = middle + 1;
                } else if (target < sortArr[middle]) {
                    // It means target lies in left side of middle
                    end = middle - 1;
                }else return middle;
            }else{ // sorted in descending fashion
                if(target > sortArr[middle]){
                    // It means target lies in left side of middle
                    end = middle-1;
                } else if (target < sortArr[middle]) {
                    // target lies in right side of middle
                    start = middle + 1;

                }else return middle; // target == sortedArr[middle]
            }
        }
        return -1;
    }


}



