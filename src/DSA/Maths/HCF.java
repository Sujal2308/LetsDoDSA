package Maths;

public class HCF {
    public static void main(String[] args) {
        // HCF = GCD = GCF
        int num1 = 15;
        int num2 = 20;
        System.out.println(hcfOfNumber(num1,num2));
    }
    static int hcfOfNumber(int num1 , int num2){
        int num = Math.max(num1,num2);
        while(num>0){
            if(num1%num==0 && num2 % num ==0){
                return num;
            }
            num--;
        }
        return num;
    }
}
