//the task is to find max height from both left and right side and then calculate the res by subtracting
class Solution {
    public int trap(int[] height) 
    {
        int n=height.length;
        int left=0,right=n-1;
        int maxleft=0,maxright=0;
        int res=0;
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]>maxleft)
                {
                    maxleft=height[left];
                }
                else
                {
                    res+=maxleft-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]>maxright)
                {
                    maxright=height[right];
                }
                else
                {
                    res+=maxright-height[right];
                }
                right--;
            }
        }
        
        return res;
        
    }
}