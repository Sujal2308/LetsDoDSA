package DSA;

public class HighestAltitude {


    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(highestAlt(arr));
    }

    static int highestAlt(int[] nums){
        int max = 0;
        int sum = 0;
        for(int i : nums){
            sum = sum + i;
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
