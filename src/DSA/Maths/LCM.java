package Maths;

public class LCM {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 12;
        System.out.println(lcmOfNumber(num1,num2));
    }
    static int lcmOfNumber(int num1 , int num2){
        int num =1;
        while(true){
            if(num1*num%num2==0){
                return num1*num;
            }
            num++;
        }
    }
}
