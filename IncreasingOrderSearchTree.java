class Solution {
    ArrayList<Integer> a=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        dfs(root);
        TreeNode root1=new TreeNode(a.get(0));
        TreeNode curr=root1;
        for(int i=1;i<a.size();i++)
        {
            curr.right=new TreeNode(a.get(i));
            curr=curr.right;
        }
        
        
        return root1;
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


//.........................................................................................................
//iterative
/*class Solution {
    TreeNode ans=new TreeNode(0);
    TreeNode ans1=ans;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        Stack<TreeNode> s=new Stack<>();
       TreeNode curr=null;
        while(!s.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                s.push(root);
                root=root.left;
            }
           root=s.pop();
            ans.right=new TreeNode(root.val);
            ans=ans.right;
            
            root=root.right;
           
        }
        
        
        
        
       return ans1.right; 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }}*/
//..................................................................................................
class Solution {
    TreeNode ans=new TreeNode(0);
    TreeNode ans1=ans;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
       
        dfs(root);
        
        
       return ans1.right; 
        
    }
    public void dfs(TreeNode root)
    {
        if(root==null)
            return;
        dfs(root.left);
        root.left=null;
        ans.right=root;
        ans=root;
        dfs(root.right);
    }
        
}    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    