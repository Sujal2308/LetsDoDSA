package DSA;

public class BinarySearch2 {
    public static void main(String[] args) {
        // Array is sorted in descending order
        int[] arr = {10,7,3,1,-3,-15};
        int target = 10;
        System.out.println(BS2(arr,target));
    }
    static int BS2(int[] sortedArr , int target){
        int start = 0;
        int end = sortedArr.length-1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target > sortedArr[middle]){
                // It means target lies in left side of middle
                end = middle-1;
            } else if (target < sortedArr[middle]) {
                // target lies in right side of middle
                start = middle + 1;

            }else return middle; // target == sortedArr[middle]
        }
        return -1; //target not found
    }
}
