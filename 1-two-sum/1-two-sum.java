class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int nret[]=new int[2];
        if(nums.length>1)
        {
            for(int i=0;i<nums.length;i++)
            {
                int diff = target-nums[i];
                if(hm.containsKey(diff))
                { 
                    nret[1]=i;
                    nret[0]=hm.get(diff);

                }
                hm.put(nums[i],i);
            }
    }
        return nret;
    }
}