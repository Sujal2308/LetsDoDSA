package DSA;

public class NumberWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {11,10,1,100,1111};
        System.out.println(countEvenDigit(arr));
    }
    static int countEvenDigit(int[] arr){
        int count = 0;
        int values = 0;
        for(int i : arr){
            int sum = 1;
             while(sum>0){
                 sum = i  / 10;
                 count++;
             }
             if(count%2==0){
                 values +=1;
             }
        }
        return values;
    }
}
