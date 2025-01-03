package DSA.Strings;

public class Leetcode709 {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(toLowerCase(str));
    }
    static String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        StringBuffer str = new StringBuffer();
         for(int i = 0 ; i<ch.length ;i++){
             if(ch[i]>='A' && ch[i]<='Z'){
                int c = ch[i] + 32; // 32 is logic
                str.append((char) c);
             }else {
                 str.append(ch[i]);
             }

         }
         return str.toString();
    }
}
