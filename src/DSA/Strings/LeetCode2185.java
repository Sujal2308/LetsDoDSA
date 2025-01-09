package DSA.Strings;

public class LeetCode2185 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words,pref));
    }
   static int prefixCount(String[] words, String pref) {
       int len = pref.length();

       int count = 0;
       for(int i = 0 ;  i < words.length ; i++){
           StringBuilder str = new StringBuilder();
           for(int j = 0 ; j<len; j++){
               if(words[i].length()<len){
                   break;
               }
               str.append(words[i].toCharArray()[j]);
           }
          if(str.toString().equals(pref)){
              count++;
          }
       }
       return count;
    }
}
