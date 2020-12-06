class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node curr=q.poll();
                if(i==size-1)
                    curr.next=null;
                else
                    curr.next=q.peek();
                
                if(curr.left!=null)
                    q.add(curr.left);
                
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return root;
           
    }
}*/
//................................................................................
class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Node c=root;
        while(root!=null)
        { Node dummy=new Node(0);
           Node curr=dummy;
         while(root!=null)
         {
             if(root.left!=null)
             {curr.next=root.left;
             curr=curr.next;}
             if(root.right!=null)
             {
                 curr.next=root.right;
                 curr=curr.next;
             }
             root=root.next;
         }
         root=dummy.next;
        
        
            
         
         
         
        }
        
        
        
        
        
        
        
        
        
        
        
        return c;
        
        
        
        
        
        
        
        
        
        
    }
}