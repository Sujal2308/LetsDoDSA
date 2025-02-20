class Solution {
    public void sortColors(int[] nums) {
           int count1 = 0;
        int count2= 0;
        int count3 = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }else{
                count3++;
            }
        }
        for(int j = 0 ; j<count1 ; j++){
            nums[j]=0;
        }
         for(int k = count1 ; k<count1+count2 ; k++){
            nums[k]=1;
        }
         for(int z = count1+count2 ; z<nums.length ; z++){
            nums[z]=2;
        }
    }
}
