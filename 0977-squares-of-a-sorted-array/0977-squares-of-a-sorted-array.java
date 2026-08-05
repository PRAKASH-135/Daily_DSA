class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int ind = nums.length-1;
        while(i<=j)
        {
            int leftsq = nums[i]*nums[i];
            int rightsq = nums[j]*nums[j];
            if(leftsq > rightsq)
            {
                ans[ind] = leftsq;
                i++;
            }
            else
            {
                ans[ind] = rightsq;
                j--;
            }
            ind--;
        }
        return ans;
    }
}