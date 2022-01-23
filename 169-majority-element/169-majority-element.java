class Solution {
    public int majorityElement(int[] nums) 
    {
        int count=0;
        Integer result = null;
        for(int i : nums)
        {
            if(count==0)
            {
                result=i;
            }
            count+=(i == result) ? 1 : -1;
        }
        return result;
    }
}