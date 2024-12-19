package DSA;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] sortedArr = {2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(ceil(sortedArr,target));
    }
    static int ceil(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start <=end){
            int middle = start + (end-start)/2;
            if(target>arr[middle]){
                start = middle + 1;

            } else if (target < arr[middle]) {
                end = middle -1;

            }else {
                return arr[middle];
            }
        }
        return arr[start];
    }
}
