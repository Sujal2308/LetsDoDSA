package Recursion;

public class CountZeros {
    static int count = 0;
    public static void main(String[] args) {
        int num = 1203000;
        System.out.println(noOfZeros(num));
    }
    static int noOfZeros(int num){
        int last = num % 10;
        if(num<10){
            return count;
        }
        if(last == 0){
            count++;
        }
        return noOfZeros(num/10);
    }
}
