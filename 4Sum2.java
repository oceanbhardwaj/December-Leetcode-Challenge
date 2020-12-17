/*class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A.length==0 || B.length==0 || C.length==0 || D.length==0)
            return 0;
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                for(int k=0;k<C.length;k++)
                {
                    for(int l=0;l<D.length;l++)
                    {
                        if(A[i]+B[j]+C[k]+D[l]==0)
                            count++;
                    }
                }
            }
        }
        return count;
    }
}*/
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A.length==0 || B.length==0 || C.length==0 || D.length==0)
            return 0;
        HashMap<Integer,Integer> h=new HashMap<>();
         for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
           h.put(A[i]+B[j],h.getOrDefault(A[i]+B[j],0)+1);
                
                
            }
         }
        int count=0;
         for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<D.length;j++)
            {
        if(h.containsKey(-1*(C[i]+D[j])))
            count+=h.get(-1*(C[i]+D[j]));
                
            }
         }
        
        return count;
        
        
        
        
    }
}



