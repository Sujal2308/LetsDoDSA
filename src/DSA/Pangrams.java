package DSA;

public class Pangrams {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
    }
    static boolean isPangram(String str){
        int start = 'a';
        int end = 'z';
            for(char ch : str.toCharArray()){
                for(int  i = start ; i<=end ; i++){
                    if(ch==i){
                     continue;
                    }
                }
            }
            return false;

    }
}
