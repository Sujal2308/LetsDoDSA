package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,2,50};
        int target = 400;
        System.out.println(LS(arr,target));
        System.out.println(MinValue(arr));

        String str = "Hello World";
        char target2 = 'l';
        System.out.println(LS2(str,target2));
    }
    // Searching target item in given array and return index of target if found otherwise return -1
    static int LS(int[] arr , int target){
        if(arr.length == 0 ){
            return -1;
        }
     for(int i = 0; i  < arr.length ; i++){
         if(arr[i]==target){
             return i ;
         }
     }
        return -1;
    }

    // Searching characters in a string and return true if ite  found
    static boolean LS2(String input , char target){
        if(input.length()==0){
            return false;
        }
//        for(char c : input.toCharArray()){
//            // toCharArray() converts strings to array of characters
//            if(c == target){
//                return true;
//            }
//        }
        for(int i = 0 ; i < input.length() ; i ++){
            if(input.charAt(i)== target){
                return true;
            }
        }
        return false;
    }

    // Finding minimum value from array of integers
    static int MinValue(int[] arr){
        int MinValue = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]<MinValue){
                MinValue = arr[i];
            }
        }
        return MinValue;
    }

}
