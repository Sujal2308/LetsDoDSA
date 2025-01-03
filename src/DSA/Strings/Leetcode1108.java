package DSA.Strings;

public class Leetcode1108 {
    public static void main(String[] args) {
        String str ="1.1.1.1";
        // replace . with [.]
        System.out.println(defangIPaddr(str));

    }
    static String defangIPaddr(String address) {
       String str = "[.]";
       StringBuilder st = new StringBuilder();

       for(char ch : address.toCharArray()){
           if(ch == '.'){
               st.append(str);
           }
           else st.append(ch);
       }
        return st.toString();
    }
}
