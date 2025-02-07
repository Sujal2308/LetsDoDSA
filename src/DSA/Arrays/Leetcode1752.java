class Solution {
    public boolean check(int[] nums) {
        int[] sortedArr = new int[nums.length];
        sortedArr = nums.clone();
        Arrays.sort(sortedArr);
        int[] newArr = new int[nums.length];

        int k = 0;
        while (k < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                newArr[(i + k) % nums.length] = nums[i];
            }
            if (Arrays.equals(sortedArr,newArr)) {
                return true;
            }
            k++;
        }
        return false;

    }
}
