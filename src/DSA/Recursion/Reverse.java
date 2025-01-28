package Recursion;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(summationOfDigits(1,0));

    }
    static int summationOfDigits(int num,int sum){
        int last = num % 10;
        if(num<10){
            return sum * 10 + last;
        }
        sum = sum * 10 + last;
       return summationOfDigits(num/10,sum);
    }
}
