package DSA.Strings;

import java.util.Arrays;

public class Leetcode344 {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e'};
        reverseString(ch);
    }
    static void reverseString(char[] ch){
        int middle = ch.length/2;
        for(int i = 0 ; i<middle;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(ch));
    }
}
