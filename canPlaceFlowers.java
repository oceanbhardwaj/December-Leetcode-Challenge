class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0)
            return true;
        if(n==0)
            return true;
        int d=flowerbed.length;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==1)
            {
                i++;
            }
            else if(i==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                n--;
                i++;
            }
            else if(i==flowerbed.length-1 && flowerbed[flowerbed.length-2]==0)
            {
                flowerbed[i]=1;
                n--;
                i++;
            }
            else if(i+1<d-1 && i-1>=0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                n--;
                i++;
            }
            if(n==0)
                return true;
        }
        return false;
        
    }
}
