package Maths;

public class LeetCode258 {
    public static void main(String[] args) {
        System.out.println(addDigits(1));

    }
    static int addDigits(int num) {
 if(num<10){
            return num;
        }
        int sum;
        int val;
     while(num>=10){
         sum = 0;
         while(num>0){
             val = num % 10;
             sum = sum + val;
             num = num/10;
         }
         num = sum;

     }
     return num;
    }
}
