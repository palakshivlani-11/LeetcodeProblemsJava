class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> ls = new ArrayList<>();
        findcombination(0,candidates,target,ls,new ArrayList<>());
        return ls;
        
    }
    
    public void findcombination(int ind,int[] arr,int target,List<List<Integer>> ls , List<Integer> ds)
    {
        if(ind==arr.length) // traversed all the nos
        {
            if(target==0) // and we have our combination
            {
                ls.add(new ArrayList<>(ds));
            }
            return ;
        }
        
        if(arr[ind]<=target)
        {
            ds.add(arr[ind]);
            findcombination(ind,arr,target-arr[ind],ls,ds);
            ds.remove(ds.size()-1);  // ds ko khali krna padega  as to store new combination;
        }
        
        findcombination(ind+1,arr,target,ls,ds);
    }
}