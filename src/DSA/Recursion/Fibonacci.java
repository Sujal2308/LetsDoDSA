package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int series = sc.nextInt();
          int previous = 0;
          int current = 1;
        System.out.println(previous);
        System.out.println(current);
        for(int i = 0 ; i<series-2 ; i++) {
            int sum = previous + current;
            System.out.println(sum);
            previous = current;
            current = sum;
        }

    }
    }


