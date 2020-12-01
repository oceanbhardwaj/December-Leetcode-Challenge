/*class Solution { //dfs
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}*/
//................................................................
class Solution { //bfs
    public int maxDepth(TreeNode root) {
        if(root==null)
return 0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty())
        {
           count++;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                
            }
        }
        
        return count;
        
        
        
    }
}