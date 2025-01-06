package DSA.Strings;

public class LeetCode1961 {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s,words));
    }
    static boolean isPrefixString(String s, String[] words) {
    String str = "";
    for(String i : words){
        str = str.concat(i);
    }
    if(s.contains(str)){
        return true;
    }
    return false;
    }

}
