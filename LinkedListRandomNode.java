class Solution {
ArrayList<Integer> a=new ArrayList<>();
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        while(head!=null)
        {
            a.add(head.val);
            head=head.next;
        }
        
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int d=(int)(Math.random()*a.size());
        int d1=a.get(d);
        return d1;
        
    }
}
//......................................................................................................................................................................................................................
class Solution {
ListNode head=null;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head=head;
        
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int i=1;
        int res=0;
        ListNode curr=head;
        while(curr!=null)
        {
            if(Math.random()<1.0/i)
            {
                res=curr.val;
            }
            i++;
            curr=curr.next;
            
        }
        return res;
    }
}
