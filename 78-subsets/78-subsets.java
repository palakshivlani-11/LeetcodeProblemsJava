class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ls = new ArrayList();
        generatesubsets(0,nums,new ArrayList<Integer>(),ls);
        return ls;
        
    }
    
    public void generatesubsets(int index,int[] arr,List<Integer> curr,List<List<Integer>> ls)
    {
        if(index>=arr.length)
        {
            ls.add(new ArrayList(curr));
            return;
        }
        
        curr.add(arr[index]);
        generatesubsets(index+1,arr,curr,ls);
        curr.remove(curr.size()-1);
        generatesubsets(index+1,arr,curr,ls);
    }
}