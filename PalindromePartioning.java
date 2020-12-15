class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        helper(s,new ArrayList<String>() ,res);
        return res;
        
        
    }
    
    public void helper(String s,ArrayList<String> curr,List<List<String>> res)
    {
        if(s.length()==0)
        {
            res.add(curr);
            
            return;
        }
        for(int i=1;i<=s.length();i++)
        {
        String left=s.substring(0,i);
        String  right=s.substring(i);
            if(Palindrome(left))
            { ArrayList<String> copy=new ArrayList<>(curr);
                copy.add(left);
                helper(right,copy,res);
            }
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean Palindrome(String s)
    {
        if(s.length()==1)
            return true;
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}