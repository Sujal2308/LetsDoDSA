package DSA;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int val = 0;
        int sum = 0;
        int number = x;
        while(x>0){
            val = x % 10;
            sum = sum * 10 + val;
            x = x / 10;
        }
        if(sum==number){
            return true;
        }
        return false;
    }
}
