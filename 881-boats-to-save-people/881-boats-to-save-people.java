class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int low=0;
        int high=people.length-1;
        int count=0;
        while(low<=high)
        {
            if(people[low]+people[high]<=limit)
            {
                low++;
            }
            count++;
            high--;
            
        }
        
        return count;
        
    }
}