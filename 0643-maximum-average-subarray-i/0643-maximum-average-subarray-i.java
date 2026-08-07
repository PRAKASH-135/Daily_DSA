class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double current = 0;
        for(int i=0 ; i<k ; i++)
        {
            current += nums[i];
        }
      double ans = current/k;
      for(int i=1 ; i<=nums.length - k ; i++)
      {
          current = current-nums[i-1]+nums[i+k-1];
          ans = Math.max(ans,current/k);
         
      }
     return ans;   
    }
}