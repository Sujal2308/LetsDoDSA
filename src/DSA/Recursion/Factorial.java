package DSA.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(factorial(value));
    }
    static int factorial(int num){
        if(num==0){
            return 1;
        }
        return num * factorial(num-1);

    }
}
