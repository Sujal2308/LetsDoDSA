package DSA.Maths;

public class BinaryOp {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(isOdd(num));
    }
    static boolean isOdd(int val){
        return (val & 1) == 1;
    }
}
