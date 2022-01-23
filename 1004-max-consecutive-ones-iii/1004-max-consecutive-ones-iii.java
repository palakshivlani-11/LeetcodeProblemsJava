class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int n=nums.length;
        int start=0;
        int end=0;
        int flip=0;
        int maxlen=Integer.MIN_VALUE;
        while(end<n)
        {
            if(nums[end]==1)
            {
                end++;
            }
            else
            {
                if(flip<k)
                {
                    flip++;
                    end++;
                }
                else
                {
                    while(flip==k)
                    {
                        if(nums[start]==0)
                        {
                            flip--;
                        }
                        start++;
                    }
                }
            }
            
            maxlen=Math.max(maxlen,end-start);
        }
        
        return maxlen;
    }
}