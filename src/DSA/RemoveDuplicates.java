package DSA;



public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,4,5,5,5,6};
        System.out.println(duplicatesCount(num));

    }
    static int duplicatesCount(int[] nums){
        int i = 1;
        for (int start = 1; start < nums.length; start++) {
            if (nums[i - 1] != nums[start]) {
                nums[i] = nums[start];
                i++;

            }

        }
        return i;

    }

}
