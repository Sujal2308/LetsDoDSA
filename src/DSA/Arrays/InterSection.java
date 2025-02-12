// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr1 = {1,2,2,3,3,4,5,6};
       int[] arr2 = {2,3,3,5,6,6,7};
       System.out.println(interSection(arr1,arr2));
    }
    static ArrayList interSection(int[] arr1, int[] arr2){
        int[] visitedArr = new int[arr2.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr1.length ;i++){
            for(int j = 0 ; j<arr2.length; j++){
                if(arr1[i]==arr2[j] && visitedArr[j]==0){
                    list.add(arr1[i]);
                    visitedArr[j] = 1;
                    break;
                }
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        return list;
    }
}
