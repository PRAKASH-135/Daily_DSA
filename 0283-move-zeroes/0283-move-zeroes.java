class Solution {
    public void moveZeroes(int[] nums) {
        int pre = 0 ;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[pre];
                nums[pre] = nums[i];
                nums[i] = temp;

                pre++;
            }


        }
        
    }
}