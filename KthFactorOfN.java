class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                a.add(i);
        }
        return (a.size()<k)?-1:a.get(k-1);
        
    }
}
//................................................................................................
class Solution {
    public int kthFactor(int n, int k) {
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && --k==0)
                return i;
        }
        return -1;
        
    }
}