package DSA.Strings;

import java.util.Arrays;

public class Leetcode125 {
    public static void main(String[] args) {
        String str =  "0P";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toLowerCase().trim().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                str.append(c);
            }
            if (c >= '0' && c <= '9') {
                str.append(c);
            }
        }
        String newStr = str.toString();
        if (newStr.equals(str.reverse().toString())) {
            return true;
        }

        return false;
    }
}
