class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int n=nums.length;
        int[] arr = new int[2];
        arr[0]=findfirst(nums,n,target);
        arr[1]=findlast(nums,n,target);
        return arr;
        
    }
    
    public int findfirst(int[] arr,int n , int target)
    {
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>target)
            {
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                ans = mid;
                high=mid-1;
            }
        }
        return ans;
    }
    
    public int findlast(int[] arr,int n,int target)
    {
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>target)
            {
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}