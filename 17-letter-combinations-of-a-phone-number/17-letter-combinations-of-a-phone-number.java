class Solution {
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
        {
            return new ArrayList();
        }
        
        String[] arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return combination("",digits,arr);
        
    }
    
    public List<String> combination(String p , String digits,String[] arr)
    {
        if(digits.length()==0)
        {
            List<String> ls = new ArrayList<String>();
            ls.add(p);
            return ls;
        }
        
        int n=0;
        int ch=digits.charAt(0)-'0';
        if(ch==7 || ch==9)
        {
            n=4;
        }
        else
        {
            n=3;
        }
        
        
        List<String> ans = new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            char a=arr[ch-2].charAt(i);
            ans.addAll(combination(p+a,digits.substring(1),arr));
        }
        
        return ans;
    }
}