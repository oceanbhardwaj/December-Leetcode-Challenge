class BSTIterator {
    ArrayList<Integer>a;
    public BSTIterator(TreeNode root) {
        a=new ArrayList<>();
        dfs(root);
        
    }
    
    public int next() {
        int d=a.remove(0);
        return d;
        
    }
    
    public boolean hasNext() {
        return a.size()>0;
        
    }
    public void dfs(TreeNode root)
    {
        if(root==null)
            return;
        dfs(root.left);
        a.add(root.val);
        dfs(root.right);
    }
}*/
//...............................................................................
class BSTIterator {
    Stack<TreeNode>s;
    public BSTIterator(TreeNode root) {
        s=new Stack<>();
        dfs(root);
        
    }
    
    public int next() {
       TreeNode d=s.pop();
        dfs(d.right);
        return d.val;
        
    }
    
    public boolean hasNext() {
        if(s.isEmpty())
            return false;
        return true;
        
    }
    public void dfs(TreeNode root)
    {
        
       while(root!=null)
       {
           s.push(root);
           root=root.left;
       }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */