package DSA;
//leetcode.com/problems/peak-index-in-a-mountain-array/description/
// leetcode.com/problems/find-peak-element/submissions/1483216815/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,0,1};
        // Mountain Array is also called as Biotonic array
        System.out.println(peakIndex(mountainArr));
    }
    static int peakIndex(int[] arr){
        int min = 0;
        int max = arr.length-1;
        while(min<max){
            int mid = min + (max - min)/2;
            if(arr[mid]>arr[mid+1]){
                max= mid;
            } else {
                min = mid +1;
            }
        }
        return min;
    }
}
