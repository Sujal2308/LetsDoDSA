package DSA;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] ref = new int[]{10,2,3,4,5};
        ref[0] = ref[1];
        System.out.println(Arrays.toString(ref));

        int[] demoArr = {-1,0,1,4};
        swapping(demoArr);

    }
    static void swap(int a , int b){
        int demo = a;
        a = b;
        b = demo;
        System.out.println(a + " " + b);

            }
            static void swapping(int[] unsortArr){
            for(int i = 0 ; i< unsortArr.length ; i++){
                for(int j = i+1 ; j< unsortArr.length ; j++){
                    if(unsortArr[j]<unsortArr[i]){
                        int temp = unsortArr[j];
                        unsortArr[j] = unsortArr[i];
                        unsortArr[i] = temp;
                    }
                }
            }
                System.out.println(Arrays.toString(unsortArr));
            }
        }



