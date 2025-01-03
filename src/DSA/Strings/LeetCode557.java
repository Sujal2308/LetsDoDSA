package DSA.Strings;

public class LeetCode557 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    static String reverseWords(String s) {
      String[] arr = s.split(" ");
      StringBuilder str = new StringBuilder();
      for(int i = 0 ; i<arr.length ; i++){
          char[] ch = arr[i].toCharArray();
          for(int j = ch.length-1;  j>=0 ;j--){
              str.append(ch[j]);
          }
          str.append(' ');
      }
      return str.toString().trim();
    }
}
