package Maths;

public class LeetCode258 {
    public static void main(String[] args) {
        System.out.println(addDigits(1));

    }
    static int addDigits(int num) {
    String str = ""+num;
    if(str.length()==1){
        return num;
    }
    int add = 0;
    while(str.length()>1){
        add = 0;
        for(int i = 0 ; i<str.length();i++){
          add = add + Character.getNumericValue(str.charAt(i));
        }
        str = ""+add;

    }
    return add;
    }
}
