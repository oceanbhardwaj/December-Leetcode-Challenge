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
