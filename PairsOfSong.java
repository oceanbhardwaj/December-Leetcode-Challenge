class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        HashMap<Integer,Integer> h=new HashMap<>();
       
       
        for(int i=0;i<time.length;i++)
        {
            int d=Math.abs(60-(time[i]%60));
            if(h.containsKey(d%60))
                count+=h.get(d%60);
               
            h.put(time[i]%60,h.getOrDefault(time[i]%60,0)+1);
        }
        
        return count;
        
        
        
        
        
        
        
    }
}