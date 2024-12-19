package DSA;

public class SearchingInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target = 5;
        System.out.println(infiniteArr(arr,target));

    }
    static int infiniteArr(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(arr[end]<target){
            int windowLength = (end - start) +1;
                start = end + 1;
                end = end + (windowLength*2);
        }
        return BS(start,end,target,arr);
    }
    static int BS(int start , int end , int target , int[] arr){
        while(start<end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            } else if (target<arr[mid]) {
                end = mid -1;
            }else {
                return mid;
            }
        }
        return-1;
    }
}
