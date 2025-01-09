package Maths;

public class LeetCode07 {
    public static void main(String[] args) {
        System.out.println(reverse(100));
    }

    public static int reverse(int x) {
double sum = 0;
        boolean b = x<0;
        if(b){
            x = x* -1;
        }
        int num = x;
        while(num>0){
            x= num % 10;
            sum = sum * 10 + x;

            num = num / 10;
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
        if(b){
            return (int)-sum;
        }
        return (int)sum;
    }
}
