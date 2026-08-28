class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int pivot = -1;
        for(int i=n-1 ; i>=0  ; i--)
        {
            if(nums[i] < nums[i+1])
            {
                pivot = i;
                break;
            }
        }
        if(pivot == -1)
        {
            reverse(nums , 0 , n);  
            return;
        }
        for(int i=n ; i > pivot ; i--)
        {
           if(nums[i] > nums[pivot])
           {
              swap(nums,pivot,i);
              break;
           }
        }
        reverse(nums,pivot+1 , n);
        
    }
    void reverse(int nums[],int st , int end)
    {
        while(st<= end)
        {
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
        st ++;
        end --;
        }
    }
    void swap(int nums[] , int pivot , int i)
    {
        int temp = nums[pivot];
        nums[pivot ] = nums[i];
        nums[i] = temp;
    }
}