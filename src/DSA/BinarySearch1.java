package DSA;

public class BinarySearch1 {
    public static void main(String[] args) {
        // Array is in sorted manner
        int[] arr = {-11,-2,0,1,2,3,4,5,10};
        int target = 3;
        System.out.println(BS(arr,target));


    }
    static int BS(int[] sortArr , int target){
        // target is the element in an array
        int start = 0;
        int end = sortArr.length-1;
        // here start and end are indexes
        while(start<=end){
            int middle = (start+end)/2 ; // optimized way of (s+e)/2
            // middle is also an index
            if(target>sortArr[middle]){
                // It means target lies in right side of middle
                start = middle + 1;
            } else if (target < sortArr[middle]) {
                // It means target lies in left side of middle
                end = middle - 1;
            }else return middle;

        }
        return -1; // target doesn't exist
    }
}
