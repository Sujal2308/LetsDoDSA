package DSA;

public class Ceilofcharacter {
    public static void main(String[] args) {
        char[] arr = {'x','x','z','y'};
        char target = 'y';
        System.out.println(ceil(arr,target));
    }
    static char ceil(char[] arr , char target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target>arr[middle]){
                start = middle + 1;
            } else if (target<arr[middle]) {
                end = middle-1;
            }
        }
        if(arr[arr.length-1]<target){
            return arr[0];
        }

        return arr[start];
    }
}
