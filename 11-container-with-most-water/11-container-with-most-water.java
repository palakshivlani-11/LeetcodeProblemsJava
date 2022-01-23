class Solution {
    public int maxArea(int[] height) 
    {
        int n=height.length;
        int leftptr = 0;
        int rightptr = n-1;
        int maxarea = 0;
        while(leftptr<rightptr)
        {
            maxarea = Math.max(maxarea , Math.min(height[leftptr],height[rightptr])*(rightptr-leftptr));
            if(height[leftptr]>height[rightptr])
            {
                rightptr--;
            }
            else
            {
                leftptr++;
            }
        }
        
        return maxarea;
        
    }
}