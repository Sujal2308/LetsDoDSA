package Recursion;

public class isPalindrome {
    static int val = 123;

    public static void main(String[] args) {
        System.out.println(palindrome(val));
    }

    static boolean palindrome(int val) {
        int reverse = summationOfDigits(val,0);
        if(reverse==val){
            return true;
        }
        return false;

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
