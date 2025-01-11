package Strings;

public class Leetcode58 {
    public static void main(String[] args) {
       String s =" fly me   to   the moon ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
       String str = s.trim();
       String[] arr = str.split(" ");
       return arr[arr.length-1].length();
    }
}
