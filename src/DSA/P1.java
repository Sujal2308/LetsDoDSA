package DSA;
public class P1 {
    public static void main(String[] args) {
     int[] nums2 = {12,345,2,6,7896};
        System.out.println(findNumbers(nums2));
    }
    static int findNumbers(int[] nums) {
        int count = 0 ;
        int pointer = 0;
        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i]>0){
                nums[i] = (int) Math.floor(nums[i]/10);
                count++;
            }
            if(count % 2 ==0){
                pointer ++;
            }
        }
        return pointer;
    }
}
