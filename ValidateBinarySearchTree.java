class Solution {
    public boolean isValidBST(TreeNode root) {
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;
        return dfs(root,min,max);
        
    }
    public boolean dfs(TreeNode root,long min,long max)
    {
        
        if(root==null)
            return true;
        if(root.val<=min || root.val>=max)
            return false;
        return dfs(root.left,min,root.val) && dfs(root.right,root.val,max);
        
        
        
        
        
    }
}




class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
         long min=Long.MIN_VALUE;
        while(root!=null || !s.isEmpty())
        {
            while(root!=null)
            {
                s.push(root);
                root=root.left;
            }
            root=s.pop();
            if((long)root.val<=min)
            {
                return false;
            }
            min=(long)root.val;
            root=root.right;
        }
return true;
        
        
    }
}



