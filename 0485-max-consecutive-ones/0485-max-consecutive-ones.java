class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int key = 0 ;
        int result = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                key++;
            }
            else
            {
                key = 0;
            }
            result = Math.max(result , key);
          
        }
        return result;
        
    }
}